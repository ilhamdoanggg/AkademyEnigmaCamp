package com.enigma.model;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * ----------------------------------------------------
 * 9/19/2019 8:55 PM
 * ----------------------------------------------------
 * This file add from Project UnitTest
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class ParkirArea {
    Integer luasLahan;
    Set<Cars> slotPark = new HashSet();
    Time time;

    public ParkirArea(Integer luasLahan) {
        this.luasLahan= luasLahan;
    }
    public Boolean chekLicense(Cars car) {
        return slotPark.contains(car);
    }
    public Integer countAvailableSpace(){
        return this.luasLahan-slotPark.size() ;
    }
    public void entryCar(Cars car) {
        slotPark.add(car);
    }
    public Boolean isFull() {
        return this.luasLahan.equals(slotPark.size());
    }
    public Boolean cekPark() {
        if (this.luasLahan >= slotPark.size()){
            return  true;
        }
        return false;
    }

    public Time getTime() {
        return time;
    }

    public void carOut(Cars car) {
        slotPark.remove(car);
    }
}
