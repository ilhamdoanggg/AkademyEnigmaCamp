package com.enigma.domain;

import java.util.Date;

/**
 * * Create at 9/25/2019 10:27 AM @author Ilhamdoanggg
 **/
public class Event {
    private Long id;
    private String title;
    private Date date;

    public Event(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
