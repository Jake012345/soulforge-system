package net.systemcstudios.soulforgesystem.util;

import net.minecraft.nbt.NbtCompound;
 //    DO NOT USE --------------------------------------------------------------

public class PlayerDataHandler {
   public static int addExampleData(IEntityDataSaver player, int dataValue) {
       NbtCompound nbt = player.getPersistentData();
       int value = nbt.getInt("dataID");
       if (true){
           value += dataValue;
       }else {

       }
       nbt.putInt("dataID", value);
       return value;
   }
//    DO NOT USE --------------------------------------------------------------

    public static int addCounterData(IEntityDataSaver player, int dataValue) {
        NbtCompound nbt = player.getPersistentData();
        int value = nbt.getInt("counter");
        if (true){
            value += dataValue;
        }else {

        }
        nbt.putInt("dataID", value);
        return value;
    }
}
