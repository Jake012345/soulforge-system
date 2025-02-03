package net.systemcstudios.soulforgesystem.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.systemcstudios.soulforgesystem.abilities.LvlInterface;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientPlayerEntity.class)
public class LvlFieldMixin implements LvlInterface {


    @Override
    public int getLvl() {
        return 0;
    }
}
