package com.enigma.model;

import javax.persistence.*;
import java.util.List;

/**
 * * Create at 9/26/2019 3:38 AM @author Ilhamdoanggg
 **/
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    private Integer id;

    @Column(name = "name_subject")
    private String name;

    @Column (name = "sks")
    private Integer sks;

    @OneToMany(mappedBy = "subject")
    private List<SubjectStudent> subjectStudents;

    public Subject() {
    }

    public Subject(Integer id, String name, Integer sks, List<SubjectStudent> subjectStudents) {
        this.id = id;
        this.name = name;
        this.sks = sks;
        this.subjectStudents = subjectStudents;
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

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public List<SubjectStudent> getSubjectStudents() {
        return subjectStudents;
    }

    public void setSubjectStudents(List<SubjectStudent> subjectStudents) {
        this.subjectStudents = subjectStudents;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sks=" + sks +
                ", subjectStudents=" + subjectStudents +
                '}';
    }
}
