package com.enigma.model;

public class Circle extends Shape {
    public Integer r;
    private final Double pi= 3.14;

    public Circle(Integer r) {
        this.r = r;
    }

    @Override
    public double getSurface() {
        return  pi*r*2;
    }

    @Override
    public double getRound() {
        return pi*r*r;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Double getPi() {
        return pi;
    }
}
