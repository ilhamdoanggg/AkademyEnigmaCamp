package com.enigma.model;

public class Block extends Reactangle {

    private Double hight;

    public Block(Double panjang, Double lebar, Double hight) {
        super(panjang, lebar);
        this.hight=hight;
    }

    public Double getVolume(){
        return getSurface()*this.hight;
    }
}
