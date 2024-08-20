package com.anbow.self_study_room_manage.bean;

public class SeatBean {
    private Integer id;
    private String name;
    private String state;

    public SeatBean() {
    }

    public SeatBean(Integer id) {
        this.id = id;
    }

    public SeatBean(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public SeatBean(Integer id, String name, String state) {
        this.id = id;
        this.name = name;
        this.state = state;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
