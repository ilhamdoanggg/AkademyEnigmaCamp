package com.enigma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Room() {
    }

    public Room(Integer id, String roomName) {
        this.id = id;
        this.roomName = roomName;
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

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
