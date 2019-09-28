package com.enigma.model;

import java.util.Objects;

public class Circle {
    public Integer r;
    private final Double pi= 3.14;
    //public boolean print;

    public Circle(Integer r) {
        this.r = r;
    }

    public Double getSurface(){
        return pi*r*r;
    }
    public Double getRound(){
        return pi*r*2;
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
        return Objects.equals(r, circle.r) &&
                Objects.equals(pi, circle.pi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, pi);
    }

    public String print() {
        return "Circle{" + "r=" + r +
                ", pi=" + pi +
                ", Surface = " +getSurface()+
                ", round = "+getRound()+
                '}';
    }
}
