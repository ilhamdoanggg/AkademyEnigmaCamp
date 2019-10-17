package com.enigma.model;


import java.util.Objects;

/**
 * |--------------------------------------------------------------------------
 * | 9/17/2019 9:18 PM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Rectangle extends Shape {

     private Double lenght;
     private Double widht;

    public Rectangle(Double lenght, Double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    @Override
    public double getSurface() {
        return lenght*widht;;
    }

    @Override
    public double getRound() {
        return 2*((widht*lenght));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return lenght.equals(rectangle.lenght) &&
                widht.equals(rectangle.widht);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, widht);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", widht=" + widht +
                '}';
    }
}
