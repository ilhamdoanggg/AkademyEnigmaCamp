package com.enigma.model;

public class Robot {
    private final String FORWARD ="F";
    Direction direction;
    private Integer Postx;
    private Integer Posty;
//    private Integer fuel;

    public Robot(Integer x, Integer y, Direction direction ){
        this.Postx=x;
        this.Posty=y;
        this.direction=direction;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "FORWARD='" + FORWARD + '\'' +
                ", direction=" + direction +
                ", Postx=" + Postx +
                ", Posty=" + Posty +
  //              ", fuel=" + fuel +
                '}';
    }
}
