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

    @Column(name = "id_subject")
    private Integer idSubject;

    @Column(name = "id_student")
    private Integer idStudents;

    @ManyToMany(mappedBy = "studentSubject")
    private List<Students> students;

    public SubjectStudent() {
    }

    public SubjectStudent(Integer id, Integer idSubject, Integer idStudents, List<Students> students) {
        this.id = id;
        this.idSubject = idSubject;
        this.idStudents = idStudents;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public Integer getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(Integer idStudents) {
        this.idStudents = idStudents;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "SubjectStudent{" +
                "id=" + id +
                ", idSubject=" + idSubject +
                ", idStudents=" + idStudents +
                ", students=" + students +
                '}';
    }
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
