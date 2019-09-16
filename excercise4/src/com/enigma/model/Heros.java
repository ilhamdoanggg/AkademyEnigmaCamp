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
    protected Integer demage;
    protected Integer skill;

    public Heros(Integer hp, Integer mp, String roleHero, String nameHero, Integer demage, Integer skill) {
        this.hp = hp;
        this.mp = mp;
        this.roleHero = roleHero;
        this.nameHero = nameHero;
        this.demage = demage;
        this.skill = skill;
    }

    public void decreaseMana(Integer manaCost){
        this.mp=this.mp-manaCost[]
    }
    public castSkill(Affected affected){
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
}
