package com.enigma.model;/*
|--------------------------------------------------------------------------
| null.java
|--------------------------------------------------------------------------
|This file add from Project excercise4
|@author Ilhamdoanggg 
|di buat pada 9/17/2019 2:47 AM
|
*/

public class Skill {

    private String skillName;
    private Integer manaCost;
    private Integer damage;

    public Skill(String skillName, Integer manaCost, Integer damage) {
        this.skillName = skillName;
        this.manaCost = manaCost;
        this.damage = damage;
    }
    public void castSkill(Affected affected){
        affected.getHit(this.damage);
    }
    public void decreaseMana(Heros heroes){
        heroes.decreaseMana(this.manaCost);
    }

    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                ", manaCost=" + manaCost +
                ", damage=" + damage +
                '}';
    }
}
