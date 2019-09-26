package com.enigma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * * Create at 9/25/2019 9:19 PM @author Ilhamdoanggg
 **/
@Entity
@Table(name = "student")
public class Students {
    @Id
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "birth_place")
    private String birthPlace;

    @Column (name = "birth_date")
    private Date birthDate;

    @Column(name = "id_room")
    private Integer id_room;

    @Column (name = "gender")
    private String gender;

    public Students() {    }

    public Students(Integer id, String name, String birthPlace, Date birthDate, Integer id_room, String gender) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.id_room = id_room;
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

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
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
                ", id_room=" + id_room +
                ", gender='" + gender + '\'' +
                '}';
    }
}
