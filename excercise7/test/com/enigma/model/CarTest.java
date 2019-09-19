package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ----------------------------------------------------
 * 9/19/2019 2:05 PM
 * ----------------------------------------------------
 * This file add from Project excercise7
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class CarTest {

    @Test
    public void assetTrue_When_LicensePlate_equals_B1234TZR(){
        String licensePlate="B1234TZR";
        Car carTest= new Car(licensePlate);
        assertEquals(licensePlate, carTest.getLicensePlate());
    }
    @Test
    public void assetFalse_When_LicensePlate_equals_B1234TZR(){
        String licensePlate="B1234TZR";
        String wrongPlate="B1234T";
        Car carTest= new Car(licensePlate);
        assertFalse(carTest.getLicensePlate().equals(wrongPlate));
    }
}
