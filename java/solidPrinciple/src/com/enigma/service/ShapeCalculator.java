package com.enigma.service;

import com.enigma.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    List<Shape> shapes = new ArrayList<>();

    public void setShapeList(Shape shape){
        shapes.add(shape);
    }

    public Double sumShapeSurface() {
        Double sum = 0.0;
        for (Shape shape : shapes) {
            sum =(sum + shape.getSurface());
        }
        return sum;
    }
}
