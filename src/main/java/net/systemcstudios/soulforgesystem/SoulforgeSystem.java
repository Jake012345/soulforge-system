package net.systemcstudios.soulforgesystem;

import net.fabricmc.api.ModInitializer;

import net.systemcstudios.soulforgesystem.networking.ModMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulforgeSystem implements ModInitializer {
	public static final String MOD_ID = "soulforge-system";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Runs when mod initializes (bound to entrypoint)

		ModMessages.registerC2SPackets(); //registering RPC from Client
	}
}