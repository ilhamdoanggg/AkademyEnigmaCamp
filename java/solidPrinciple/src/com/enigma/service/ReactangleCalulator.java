package com.enigma.service;

import com.enigma.model.Reactangle;

import java.util.ArrayList;
import java.util.List;

public class ReactangleCalulator {
    List<Reactangle> reactangles = new ArrayList<>();


    public void addReactangle(Reactangle reactangle){
        reactangles.add(reactangle);
    }
    public Integer sum(){
        int sum =0;
        for (Reactangle reactangle : reactangles) {
            sum = (int) (sum+reactangle.getSurface());
        }
        return sum;
    }
}
