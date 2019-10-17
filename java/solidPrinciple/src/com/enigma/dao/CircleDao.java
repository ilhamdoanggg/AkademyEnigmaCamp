package com.enigma.dao;

import com.enigma.model.Circle;

import java.util.HashSet;
import java.util.Set;

public class CircleDao {

    Set<Circle> circles = new HashSet<>();

    public void addCircle (Circle circle){
        circles.add(circle);
    }

    public removeCircleDao(Circle circle){
        circles.remove(circle);
    }


}
