package net.systemcstudios.soulforgesystem.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.server.network.ServerPlayerEntity;
import org.lwjgl.glfw.GLFW;

import static net.minecraft.text.Text.literal;

public class SoulforgeSytemKeyInputHandler {
    public static final String KEY_CATEGORY_SOULFORGE_SYSTEM = "Soulforge System";
    public static final String KEY_ACTION_ABILITY_1 = "key_soulforge_system_ability_1";
    public static final String KEY_ACTION_ABILITY_2 = "key_soulforge_system_ability_2";
    public static final String KEY_ACTION_ABILITY_3 = "key_soulforge_system_ability_3";
    public static final String KEY_ACTION_ABILITY_4 = "key_soulforge_system_ability_4";
    public static final String KEY_ACTION_ABILITY_5 = "key_soulforge_system_ability_5";

    public static KeyBinding abilityAction1;
    public static KeyBinding abilityAction2;
    public static KeyBinding abilityAction3;
    public static KeyBinding abilityAction4;
    public static KeyBinding abilityAction5;


    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(abilityAction1.wasPressed()) {

            }
            if(abilityAction2.wasPressed()) {

            }
            if(abilityAction3.wasPressed()) {

            }
            if(abilityAction4.wasPressed()) {

            }
            if(abilityAction5.wasPressed()) {

            }
        });
    }
    public static void register() {
        abilityAction1 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTION_ABILITY_1,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                KEY_CATEGORY_SOULFORGE_SYSTEM

        ));
        abilityAction2 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTION_ABILITY_2,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_X,
                KEY_CATEGORY_SOULFORGE_SYSTEM

        ));
        abilityAction3 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTION_ABILITY_3,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_C,
                KEY_CATEGORY_SOULFORGE_SYSTEM

        ));
        abilityAction4 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTION_ABILITY_4,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_V,
                KEY_CATEGORY_SOULFORGE_SYSTEM

        ));
        abilityAction5 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTION_ABILITY_5,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_B,
                KEY_CATEGORY_SOULFORGE_SYSTEM

        ));
        registerKeyInputs();
    }
}
