package com.enigma.model;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ParkingTest {
    @Test
    //hitungan Ruang yang Tersedia Jika ruang 1 saat tidak ada tempat parkir
    public void countAvailableSpace_Should_space1_when_noCarparkget(){
        Integer slotPark = 1;
        ParkirArea parkingAreaTest = new ParkirArea(slotPark);
        assertEquals(parkingAreaTest.countAvailableSpace(),slotPark);
    }
    @Test
//hitungan Ruang yang Tersedia harus kembali 2 saat 1 mobil Masuk
    public void countAvailableSpace_should_return2_when_1CarEntryPark(){
        Integer slotPark = 3;
        Integer expectedAvailableSpace = 2;
        ParkirArea parkingArea =new ParkirArea(slotPark);
        Cars mobil = new Cars("B4533 spz");
        parkingArea.entryCar(mobil);
        assertEquals(expectedAvailableSpace,parkingArea.countAvailableSpace());
    }

    @Test
    // jika parkir tidak full dan mobil masuk 1 maka akan false
    public void parking_is_full_when_car_parking_in_Slot_Into_Max(){
        Integer slotPark=2;
        Boolean exceptedFull = false;
        ParkirArea parkingArea = new ParkirArea(slotPark);
        Cars inova = new Cars("B 123 CCC");
        parkingArea.entryCar(inova);
        parkingArea.isFull();
        assertEquals(exceptedFull,parkingArea.isFull());
    }
    @Test
    public void parking_is_full_when_car_parking1_in_Slot_Into_Max(){
        Integer slotPark=2;
        Boolean exceptedFull = true;
        ParkirArea parkingArea = new ParkirArea(slotPark);
        Cars inova = new Cars("B 123 CCC");
        Cars dd = new Cars("B 123 CCC");
        // mobil parkir 2
        parkingArea.entryCar(dd);
        parkingArea.entryCar(inova);
        parkingArea.isFull();
        assertEquals(exceptedFull,parkingArea.isFull());
    }
    @Test
    //tempat parkir tidak bisa untuk parkir mobil ketika slot parkir penuh
    public void parking_shouldFalse_to_parkCar_When_parkingSlot_isFull(){
        Integer slotPark = 2 ;
        Boolean exceptedFull = false;
        ParkirArea parkingArea = new ParkirArea(slotPark);
        Cars inova = new Cars("BE 1234 RRR");
        Cars xenia = new Cars("BE 1234 RRR");
        parkingArea.entryCar(inova);
        parkingArea.entryCar(xenia);
        parkingArea.cekPark();
        assertEquals(exceptedFull,parkingArea.cekPark());
    }
    @Test
    //tidak bisa parkir kompilasi ada plat mobil yang sama
    public void canot_compile_parking_there_is_the_same_car_plate(){
        Integer slotPark = 3;
        Boolean exceptedFull = false;
        ParkirArea parkingArea = new ParkirArea(slotPark);
        Cars mycar = new Cars("BE 2134 JJJ");
        Cars yourCar = new Cars("BE 2134 JJJ");
        parkingArea.entryCar(mycar);
        parkingArea.chekLicense(yourCar);
        assertEquals(true,parkingArea.chekLicense(yourCar));
    }

    @Test
    public void Car_out_When_finish_parking(){
        Integer slotPark = 2;
        Integer excepted = 2;
        ParkirArea parkingArea = new ParkirArea(slotPark);
        Cars car = new Cars("BE 12233 ZZZ");
        parkingArea.entryCar(car);
        parkingArea.carOut(car);
        assertEquals(excepted,parkingArea.countAvailableSpace());
    }

}
