package com.enigma.model;

import java.util.Date;

/**
 * * Create at 9/25/2019 9:19 PM @author Ilhamdoanggg
 **/
public class Students {
    private Integer id;
    private String name;
    private String birthPlace;
    private Date birthDate;
    private String gender;

    public Students() {
    }

    public Students(Integer id, String name, String birthPlace, Date birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}
