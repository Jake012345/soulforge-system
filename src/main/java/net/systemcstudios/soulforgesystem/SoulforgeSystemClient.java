package net.systemcstudios.soulforgesystem;

import net.fabricmc.api.ClientModInitializer;
import net.systemcstudios.soulforgesystem.abilities.Ability;
import net.systemcstudios.soulforgesystem.event.SoulforgeSytemKeyInputHandler;
import net.systemcstudios.soulforgesystem.networking.ModMessages;

public class SoulforgeSystemClient implements ClientModInitializer {
    public Ability ability = new Ability();

    @Override
    public void onInitializeClient() {
        // Runs on initialization, bound to entrypoint
        SoulforgeSytemKeyInputHandler.register();
        ModMessages.registerS2CPackets(); // registering RPC from server
    }
}
