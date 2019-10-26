package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg 
|di buat pada 9/17/2019 2:35 AM
|
*/

public class Heros extends Affected implements HitAble, Offensive{

    protected Integer hp;
    protected Integer mp;
    protected String  roleHero;
    protected String  nameHero;
    protected Integer damage;
    protected Skill skill;

    public Heros(Integer hp, Integer mp, String roleHero, String nameHero, Integer damage, Skill skill) {
        this.hp = hp;
        this.mp = mp;
        this.roleHero = roleHero;
        this.nameHero = nameHero;
        this.damage = damage;
        this.skill = skill;
    }
    public void decreaseMana(Integer manaCost){
        this.mp=this.mp - manaCost;
    }
    public void castSkill(Affected affected){
        skill.castSkill(affected);
        skill.decreaseMana(this);
    }
    @Override
    public void getHit(Integer demage) {
        this.hp = this.hp - damage;
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.damage);
    }

    public String toString() {
        return "Heros{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", roleHero='" + roleHero + '\'' +
                ", nameHero='" + nameHero + '\'' +
                ", damage=" + damage +
                ", skill=" + skill +
                '}';
    }
}
