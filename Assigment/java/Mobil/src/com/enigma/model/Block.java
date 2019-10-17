package com.enigma.model;

public class Block extends Ractangle{
    private Double height;
    public Block(Double lenght, Double widht, Double height){
        super(lenght, widht);
        this.height= height;
    }
    public Double getVoleume(){
        return this.height * this.widht * this.lenght;
    }
    private Double getSurface(){
        return 2*(this.height * this.widht)+
                2*(this.widht*this.lenght)+
                2*(this.lenght*this.height);
    }

    public String print() {
        return this.widht + "+ " + this.lenght + ", " + getVoleume() +", "+ getSurface();
    }

}
