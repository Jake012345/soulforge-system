package net.systemcstudios.soulforgesystem.abilities;

public class MinerAbility implements LvlInterface{
    boolean skillUsed = false;
    int xp = xpEarn();
    public int xpEarn() {
        if(skillUsed) {
            return xp + 5;
        }
        else return 0;
    }
    @Override
    public int getLvl() {
        if(xp >= 100) {
            if(xp >= 200) {
                if(xp >= 300) {
                    if(xp >= 400) {
                        if(xp>= 500) {
                            if(xp >= 600) {
                                if(xp >= 700) {
                                    if(xp >= 800) {
                                        return 8;
                                    }
                                    else return 7;
                                }
                                else return 6;
                            }
                            else return 5;
                        }
                        else return 4;
                    }
                    else return 3;
                }
                else return 2;
            }
            else return 1;
        }
        else return 0;
    }
}