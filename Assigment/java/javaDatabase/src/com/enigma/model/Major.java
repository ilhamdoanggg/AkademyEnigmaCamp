package com.enigma.model;

/**
 * * Create at 9/25/2019 2:40 AM @author Ilhamdoanggg
 **/
public class Major {
    private String idMajor;
    private String manjorName;

    public Major(String idMajor, String manjorName) {
        this.idMajor = idMajor;
        this.manjorName = manjorName;
    }

    public String getIdMajor() {
        return idMajor;
    }

    public void setIdMajor(String idMajor) {
        this.idMajor = idMajor;
    }

    public String getManjorName() {
        return manjorName;
    }

    public void setManjorName(String manjorName) {
        this.manjorName = manjorName;
    }

    @Override
    public String toString() {
        return "Major{" +
                "idMajor='" + idMajor + '\'' +
                ", manjorName='" + manjorName + '\'' +
                '}';
    }
}
