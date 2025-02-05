package net.systemcstudios.soulforgesystem.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.systemcstudios.soulforgesystem.util.IEntityDataSaver;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(Entity.class)
public abstract class EntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound persistentData;

    @Override
    public NbtCompound getPersistentData() {
        if(this.persistentData == null) {
            this.persistentData = new NbtCompound();
        }
        return persistentData;
    }


}
