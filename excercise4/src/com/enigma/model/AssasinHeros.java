package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg 
|di buat pada 9/17/2019 2:57 AM
|
*/

public class AssasinHeros extends Heros {

    public AssasinHeros(Integer hp, Integer mp, String roleHero, String nameHero, Integer demage, Skill skill) {
        super(hp, mp, roleHero, nameHero, demage, skill);

    }

    public String toString() {
        return "Assasin{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", roleHero='" + roleHero + '\'' +
                ", nameHero='" + nameHero + '\'' +
                ", demage=" + damage +
                ", skill=" + skill +
                '}';
    }
}
