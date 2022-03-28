package com.corejava.day06.abstracedemov2;

public abstract class KillChain {
    public abstract void rceonnaissance();

    public abstract void weaponization();

    public final void topMethod(){
        rceonnaissance();
        weaponization();
    }
}
