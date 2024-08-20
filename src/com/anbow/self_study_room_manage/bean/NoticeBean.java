package com.anbow.self_study_room_manage.bean;

public class NoticeBean {
    private Integer id;
    private String title;
    private String content;
    private String time;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public NoticeBean() {
    }

    public NoticeBean(Integer id) {
        this.id = id;
    }

    public NoticeBean(String title, String content, String time, String state) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.state = state;
    }

    public NoticeBean(Integer id, String title, String content, String time, String state) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.state = state;
    }
};
