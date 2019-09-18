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


    public Creep(Integer healthPoint, Integer damage) {
        this.healthPoint = healthPoint;
        this.damage = damage;
    }


    @Override
    public void getSkill(Affected affected, Integer damage) {
        super.getSkill(affected, damage);
    }

    @Override
    public void getHit(Integer demage) {
        this.healthPoint=this.healthPoint-demage;
    }

    @Override
    public void attack(HitAble hitAble) {
        this.healthPoint = this.healthPoint - damage;
    }

    public String toString() {
        return "Creep{" +
                "healthPoint=" + healthPoint +
                ", damage=" + damage +
                '}';
    }
}
