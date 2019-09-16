package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg 
|di buat pada 9/17/2019 2:57 AM
|
*/

public class Assasin extends Heros {

    public Assasin(Integer hp, Integer mp, String roleHero, String nameHero, Integer demage, Integer skill) {
        super(hp, mp, roleHero, nameHero, demage, skill);

    }

    public String toString() {
        return "Assasin{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", roleHero='" + roleHero + '\'' +
                ", nameHero='" + nameHero + '\'' +
                ", demage=" + demage +
                ", skill=" + skill +
                '}';
    }
}
