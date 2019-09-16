package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg hanya manusia
|di buat pada 9/17/2019 3:01 AM
|
*/

public class Creep extends Affected implements HitAble, Offensive {
    private Integer healthPoint;
    private Integer damage;
    private Skill getSkill;

    public Creep(Integer healthPoint, Integer damaged, Skill getSkill) {
        this.healthPoint = healthPoint;
        this.damage = damaged;
        this.getSkill = getSkill;
    }


    @Override
    public void getHit(Integer demage) {
        super.getSkill(affected, damage);
    }

    @Override
    public void attack(HitAble hitAble) {
        this.healthPoint = this.healthPoint - damaged;

    }
}
