package com.enigma.model;

/**
 * * Create at 9/26/2019 3:38 AM @author Ilhamdoanggg
 **/
public class Subject {
    private Integer id;
    private String name;
    private Integer sks;

    public Subject() {
    }

    public Subject(Integer id, String name, Integer sks) {
        this.id = id;
        this.name = name;
        this.sks = sks;
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

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sks=" + sks +
                '}';
    }
}
