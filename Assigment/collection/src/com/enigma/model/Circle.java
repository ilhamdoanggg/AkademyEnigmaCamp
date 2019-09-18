package com.enigma.model;

import java.util.Objects;

/**
 * |--------------------------------------------------------------------------
 * | 9/17/2019 9:15 PM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Circle extends Shape {

    public Integer r;
    private final Double pi= 3.14;

    public Circle(Integer r) {
        this.r = r;
    }

//    public Double getSurface(){ return pi*r*r;
//    }
//    public Double getRound(){
//        return pi*r*2;
//    }

    @Override
    public double getSurface() {
        return  pi*r*2;
    }

    @Override
    public double getRound() {
        return pi*r*r;
    }

    public Double getHalfSurface(){
        return getSurface()/2;
    }
    public Double getHalfRound(){
        return getRound()/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r.equals(circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }
}
