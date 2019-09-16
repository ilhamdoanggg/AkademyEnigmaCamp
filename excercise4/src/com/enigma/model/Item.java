package com.enigma.model;

public class Item extends Role {
    public Integer weapon;
    public Item(Integer hp, Integer mp, Integer level, Integer skill, Integer demage, Integer roleHero) {
        super(hp, mp, level, skill, demage, roleHero);
        this.weapon= weapon;
    }
}
