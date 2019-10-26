package com.enigma.model;

public abstract class Affected implements HitAble {
    public void getSkill(Affected affected, Integer damage){
        affected.getHit(damage);
    }
}
