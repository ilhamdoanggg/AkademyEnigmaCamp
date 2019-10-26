package com.enigma.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student{
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column (name = "birth_place")
    private String birthPlace;

    @Column (name = "birth_date")
    private Date birthDate;

    @Column (name = "gender")
    private String gender;

    @Column (name = "id_room")
    private String room;

//    @ManyToOne
//    @JoinColumn(name = "id_room")
//    private Room room;
//
//    @OneToMany(mappedBy = "student")
//    private List<SubjectStudent> subjectStudents;
//    /*@JoinTable(name = "subject_student",
//            joinColumns={@JoinColumn(name ="id_student")},
//            inverseJoinColumns={@JoinColumn(name = "id")})*/

    public Student() {
    }

    public Student(Integer id, String name, String birthPlace, Date birthDate, String gender, String room  /*Room room, List<SubjectStudent> subjectStudents*/) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
        this.room= room;
//        this.room = room;
//        this.subjectStudents = subjectStudents;
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

//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }

//    public List<SubjectStudent> getSubjectStudents() {
//        return subjectStudents;
//    }
//
//    public void setSubjectStudents(List<SubjectStudent> subjectStudents) {
//        this.subjectStudents = subjectStudents;
//    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
//                ", room=" + room.getId() +
//                ", subjectStudents=" + subjectStudents +
                '}';
    }
}