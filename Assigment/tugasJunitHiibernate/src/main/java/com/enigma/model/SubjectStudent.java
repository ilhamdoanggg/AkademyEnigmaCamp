package com.enigma.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;

/**
 * * Create at 9/27/2019 12:53 AM @author Ilhamdoanggg
 **/
@Entity
@Table(name = "subject_student")
public class SubjectStudent {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_subject")
    private  Subject subject;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Students student;

    public SubjectStudent() {
    }

    public SubjectStudent(Integer id, Subject subject, Students student) {
        this.id = id;
        this.subject = subject;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "SubjectStudent{" +
                "id=" + id +
                ", subject=" + subject.getId() +
                ", student=" + student.getId() +
                '}';
    }

    //    @ManyToMany(mappedBy = "id_student")
//    private List<Students> students;

    /*
    @JoinTable(name = "stock_category",
    catalog = "mkyongdb", joinColumns = {
            @JoinColumn(name = "STOCK_ID",
            nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn
            (name = "CATEGORY_ID",
            nullable = false, updatable = false) })

*/

//    joinColumns = { @JoinColumn(name = "employee_id") },
//    inverseJoinColumns = { @JoinColumn(name = "project_id")

}
