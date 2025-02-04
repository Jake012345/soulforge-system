package net.systemcstudios.soulforgesystem;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.server.command.SetBlockCommand;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulforgeSystem implements ModInitializer {
	public static final String MOD_ID = "soulforge-system";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Runs when mod initializes (bound to entrypoint)
	}
}