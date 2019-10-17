package com.enigma.model;

public class Triangle extends Shape {
    Integer alas;
    Integer tinggi;

    @Override
    public double getSurface() {
        return (alas* tinggi) / 2;
    }

    @Override
    public double getRound() {
        return 0;
    }
}
