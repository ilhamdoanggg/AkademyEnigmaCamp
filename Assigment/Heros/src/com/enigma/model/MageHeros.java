package com.enigma.model;

/**
 * |--------------------------------------------------------------------------
 * | 9/18/2019 1:47 AM
 * |--------------------------------------------------------------------------
 * |This file add from Project excercise4
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class MageHeros extends Heros {

    protected Integer mpPlus;
    public MageHeros(Integer hp, Integer mp, String roleHero, String nameHero, Integer damage, Skill skill) {
        super(hp, mp, roleHero, nameHero, damage, skill);
        this.mpPlus=this.mp+300;
    }
}
