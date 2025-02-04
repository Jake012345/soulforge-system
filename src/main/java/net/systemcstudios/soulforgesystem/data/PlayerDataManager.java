package net.systemcstudios.soulforgesystem.data;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.PersistentState;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerDataManager extends PersistentState {
    private static final String DATA_KEY = "soulforge_sytem_player_data";
    private final Map<UUID, PlayerData> playerDataMap = new HashMap<>();


    // Get or create player data
    public PlayerData getPlayerData(UUID playerId) {
        return playerDataMap.computeIfAbsent(playerId, k -> new PlayerData());
    }

    // Serialize data to NBT
    //@Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        int x = 5;
        NbtCompound playersNbt = new NbtCompound();
        playerDataMap.forEach((uuid, data) -> {
            NbtCompound playerNbt = new NbtCompound();
            playerNbt.putInt("someValue", data.getValue());
            playersNbt.put(uuid.toString(), playerNbt);
        });
        nbt.put("players", playersNbt);
        return nbt;
    }

    // Deserialize data from NBT
    public static PlayerDataManager readNbt(NbtCompound nbt) {
        PlayerDataManager manager = new PlayerDataManager();
        NbtCompound playersNbt = nbt.getCompound("players");
        for (String key : playersNbt.getKeys()) {
            UUID uuid = UUID.fromString(key);
            NbtCompound playerNbt = playersNbt.getCompound(key);
            PlayerData data = new PlayerData();
            data.setValue(playerNbt.getInt("someValue"));
            manager.playerDataMap.put(uuid, data);
        }
        return manager;
    }

    // Get or create the PersistentState for a world
    public static PlayerDataManager get(ServerWorld world) {
        return world.getPersistentStateManager().getOrCreate(
                PlayerDataManager::readNbt,
                PlayerDataManager::new,
                DATA_KEY
        );
        return new PlayerDataManager();
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        return null;
    }
}