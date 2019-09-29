package com.enigma.model;

import java.util.Objects;

/**
 * |--------------------------------------------------------------------------
 * | 9/18/2019 12:21 AM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Orang {
    String namaOrang;

    public Orang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orang orang = (Orang) o;
        return namaOrang.equals(orang.namaOrang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namaOrang);
    }

    @Override
    public String toString() {
        return "Orang{" +
                "namaOrang='" + namaOrang + '\'' +
                '}';
    }
}
