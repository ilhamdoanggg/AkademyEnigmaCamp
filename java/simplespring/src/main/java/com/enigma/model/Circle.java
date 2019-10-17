package com.enigma.model;

import java.util.Objects;

public class Circle {
    public Integer r;
    private final Double pi= 3.14;

    public Circle(Integer r) {
        this.r = r;
    }

    public double getSurface() {
        return  pi*r*2;
    }

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r) &&
                Objects.equals(pi, circle.pi);
    }

    public int hashCode() {
        return Objects.hash(r, pi);
    }
}