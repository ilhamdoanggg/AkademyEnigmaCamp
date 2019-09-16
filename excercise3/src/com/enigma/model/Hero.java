package com.enigma.model;

public class Hero {
    private Integer hp;
    private Integer mp;
    private Integer level;
    private Integer skill;

    public Hero(Integer hp, Integer mp, Integer level, Integer skill){
        this.hp=hp;
        this.mp = mp;
        this.level=level;
        this.skill =skill;
    }
    public Integer getLevel(){
        this.level =this.level + level;
        return level;
    }
    public Integer getHp() {
        this.hp = level*100;
        //System.out.println("Total Healt Point " + this.hp);
        return this.hp;
    }
    public Integer getMp(){
        this.mp = level*50;
        //System.out.println("total Magic Point " + this.mp);
        return this.mp;
    }
    public Integer isSkillUse(){
        return mp*level/100;
    }

}
