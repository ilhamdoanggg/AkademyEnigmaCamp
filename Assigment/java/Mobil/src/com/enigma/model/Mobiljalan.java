package com.enigma.model;

public class Mobiljalan {
    private Boolean isStart;
    private Integer bensin = 0;

    Integer titikx=0;
    Integer titiky=0;


    public void isFluel(int bensin){
        this.bensin=this.bensin+bensin;
    }

/*
    public String isFuelUse(){
        for (int i=0, i<isFluel(); , i++){
            assert;
        }
        //return bensin*3;
    }
*/

    public void startPoint(int titikx, int titiky){
        this.titikx=this.titikx + titikx;
        this.titiky=this.titiky + titiky;
    }
    public void rumus(){

    }

    Boolean isFuelSufficient(){
        return this.bensin>0;
    }
    public String enginStart(){
        if(isFuelSufficient()){
            isStart = true;
            return "boom boom";
        }
        return "fail";
        //if (isFuelSufficient())
    }
    public String engineStop(){
        isStart = false;
        return "Stop";
    }

    public void parking(){
        System.out.println("park");
        if(isStart){
            System.out.println("not yet");
            return;
        }
        System.out.println("done");
    }


}
