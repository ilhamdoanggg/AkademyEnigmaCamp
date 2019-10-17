package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ----------------------------------------------------
 * 9/19/2019 8:54 PM
 * ----------------------------------------------------
 * This file add from Project UnitTest
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class CarsTest {

    @Test
    public void assetTrue_When_LicensePlate_equals_B1234TZR(){
        String licensePlate="B1234TZR";
        Cars carTest= new Cars(licensePlate);
        assertEquals(licensePlate, carTest.getLicensePlate());
    }

    @Test
    public void assetFalse_When_LicensePlate_equals_B1234TZR(){
        String licensePlate="B1234TZR";
        String wrongPlate="B1234T";
        Cars carTest= new Cars(licensePlate);
        assertFalse(carTest.getLicensePlate().equals(wrongPlate));
    }

}
