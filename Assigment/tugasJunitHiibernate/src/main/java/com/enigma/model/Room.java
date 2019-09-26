package com.enigma.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * * Create at 9/26/2019 2:10 PM @author Ilhamdoanggg
 **/
@Entity
@Table(name = "room")
public class Room {
    @Id
    private Integer id;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "room")
    private List<Students> students;

    public Room() {
    }

    public Room(Integer id, String roomName, Integer capacity) {
        this.id = id;
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
