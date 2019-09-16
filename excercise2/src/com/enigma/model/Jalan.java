package com.enigma.model;

public class Jalan {
    private Integer postx;
    private Integer posty;
    private Integer fuel=0;
    private final String R= "R";
    private final String L = "L";
    private final String B = "B";
    private final String F = "F";
    private char[] Commands;

    public Jalan(Integer x, Integer y){
        this.postx=x;
        this.posty=y;
    }

    public Integer addFuel(int fuel){
        this.fuel = this.fuel + fuel;
        return fuel;
    }


    public void calculateFuil() {
        //int fuel = this.fuel;
        for (int i = 0; i <= this.Commands.length; i++) {
            if ((i + 1) % 3 == 0) {
                this.fuel--;
            }
        }
        if (this.fuel==0){
            System.out.println("bensin abis");
        }else{
            System.out.println("");
        }this.fuel=0;
        }

    public String Move(String move) {
        if(move.equals(R)){
            this.postx++;
        }else if(move.equals(F)){
            this.posty++;
        }else if (move.equals(L)){
            this.postx--;
        }else if(move.equals(B)){
            this.posty--;
        }else{
        }
        return "";
    }

    public String setCommand(String commands) {
        this.Commands = commands.toCharArray();
        return "";
    }

    public  String runs(){

        for (int i=0;i<this.fuel*3; i++){
            Move(String.valueOf(this.Commands[i]));
            System.out.println(this.Commands[i] + getPost());
        }
        calculateFuil();
        return "";
    }

    public String getPost(){
        return "("+postx +","  +posty +")" ;
    }

    public String print(){
            return "Jalan{" +
                    "postx=" + postx +
                    ", posty=" + posty +
                    ", fuel =" + fuel +
                    ", "+
                    '}';
        }

}
