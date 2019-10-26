package com.enigma.model;

public class Ractangle {
    protected Double lenght;
    protected Double widht;

    public Ractangle(Double lenght, Double widht){
        this.lenght=lenght;
        this.widht=widht;
    }
    Double getSurfface(){
        return lenght*widht;
    }
    Double getRound(){
        return 2*((widht*lenght));
    }
}
