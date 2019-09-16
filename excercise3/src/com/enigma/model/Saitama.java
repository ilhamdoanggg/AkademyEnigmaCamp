package com.enigma.model;

public class Saitama {
    public Integer hp;
    public Integer mp;
    public Integer baseDemage;
    private Integer getHit;

    public Saitama(Integer hp, Integer mp, Integer baseDemage) {
        this.hp = hp;
        this.mp = mp;
        this.baseDemage = baseDemage;
    }
    public void getHit(Integer demage){
        this.hp=this.hp-demage;
    }
    public void attack(Saitama saitama){
        saitama.getHit=(this.baseDemage);
    }

    public String print() {
        return "Saitama{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", baseDemage=" + baseDemage +
                '}';
    }
}
