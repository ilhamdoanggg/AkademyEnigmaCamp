package com.enigma.model;

import java.util.Arrays;

public class Role extends Hero {

    private Integer demage;
    public Integer roleHero;

    public Role(Integer hp, Integer mp, Integer level, Integer skill, Integer demage, Integer roleHero) {
        super(hp, mp, level, skill);
        this.demage = demage;
        this.roleHero=roleHero;
    }

    public Integer getDemage(){
        this.demage= 50 * getLevel();
        return demage;
    }


    public String getClassHero(int role){
//        for(int i=0; i<roleHero.length; i++){
//            System.out.println(roleHero[i]);
            if (role==(1)) {
                System.out.println("you choose class Tank");
                System.out.println("total Magic Point " + 100 * getMp());
                System.out.println("total Healt Point " + 30 * getHp());
                System.out.println("total Demage " + 20 * getDemage());
            }else if (role==(2)) {
                System.out.println("you choose class Arcer");
                System.out.println("total Magic Point " + 10 * getMp());
                System.out.println("total Healt Point " + 35 * getHp());
                System.out.println("total Demage " + 25 * getDemage());
            }else if (role==(3)) {
                System.out.println("you choose class Mage");
                System.out.println("total Magic Point " + 20 * getMp());
                System.out.println("total Healt Point " + 40 * getHp());
                System.out.println("total Demage " + 32 * getDemage());
            }else if (role==(4)) {
                System.out.println("you choose class Assasin ");
                System.out.println("total Magic Point " + 40 * getMp());
                System.out.println("total Healt Point " + 50 * getHp());
                System.out.println("total Demage " + 55 * getDemage());
            }else if (role==(5)) {
                System.out.println("you choose class Warior");
                System.out.println("total Magic Point " + 50 * getMp());
                System.out.println("total Healt Point " + 50 * getHp());
                System.out.println("total Demage " + 60 * getDemage());
            }

        return "";
    }

/*
    public String getRoles(String[] role) {
        for (int i = 0; i< rolesname.length ; i++) {
            chooseHero(String.valueOf(this.rolesname[i]));
            System.out.println(chooseHero(role));

        }
        return "";
    }
*/


    }
