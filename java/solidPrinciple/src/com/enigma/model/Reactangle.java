package com.enigma.model;

public class Reactangle extends Shape{
    Double panjang;
    Double lebar;

    public Reactangle(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double getSurface() {
        return panjang*lebar;
    }

    @Override
    public double getRound() {
        return 2*((lebar*panjang));
    }

    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }
}
