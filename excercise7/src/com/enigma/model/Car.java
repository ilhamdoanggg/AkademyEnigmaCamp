package com.enigma.model;

import java.util.Objects;

/**
 * ----------------------------------------------------
 * 9/19/2019 2:04 PM
 * ----------------------------------------------------
 * This file add from Project excercise7
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class Car {
    public String  licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }

}
