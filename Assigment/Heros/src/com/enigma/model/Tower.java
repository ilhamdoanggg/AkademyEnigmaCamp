package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg hanya manusia
|di buat pada 9/17/2019 9:32 AM
|
*/

public class Tower implements HitAble, Offensive {
    protected String namaTower;
    protected Integer hp;
    protected Integer damage;

    public Tower(String namaTower, Integer hp, Integer damage) {
        this.namaTower = namaTower;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public void getHit(Integer demage) {
    this.hp=this.hp -demage;
    }

    @Override
    public void attack(HitAble hitAble) {
    hitAble.getHit(this.damage);
    }

    public String toString() {
        return "Tower{" +
                "namaTower='" + namaTower + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
