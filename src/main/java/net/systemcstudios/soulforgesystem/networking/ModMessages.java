package net.systemcstudios.soulforgesystem.networking;

import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket;
import net.minecraft.util.Identifier;
import net.systemcstudios.soulforgesystem.SoulforgeSystem;
import net.systemcstudios.soulforgesystem.networking.packet.C2SPacketCounter;

public class ModMessages implements CustomPayload {
    public static final CustomPayload.Id<ModMessages> ID = new CustomPayload.Id<>(Identifier.of(SoulforgeSystem.MOD_ID, "counter"));



    public static void registerC2SPackets() {
        //ServerPlayNetworking.registerGlobalReceiver(COUNTER_ID, C2SPacketCounter::receive);
    }

    public static void registerS2CPackets() {

    }

    @Override
    public Id<? extends CustomPayload> getId() {
        return null;
    }
}
