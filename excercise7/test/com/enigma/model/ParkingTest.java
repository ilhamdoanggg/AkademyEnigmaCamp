package com.enigma.model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * ----------------------------------------------------
 * 9/19/2019 2:11 PM
 * ----------------------------------------------------
 * This file add from Project excercise7
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class ParkingTest {

    @Test
    public void countAvailable_Space_return1_When_noCarPark(){
        Integer luasLahan =1;
        Parking parking = new Parking();
    }

    @Test
    public void assetTrue_When_ParkingSlot_Empty(){
        Integer luasLahan = 5;
    }

    @Test
    public void isMaxParkir_Full(){

        Integer luasLahan = 2;
        Parking parkiran = new Parking(luasLahan);
        Car mobil = new Car("LLLk");
        parkiran.entryCar();
        parkiran.isFull();
        assertEquals(parkiran, );

    }
}