package com.example.demo.entity;

public class Course {
    private long id;
    private  String title;
    private String discription;

    public Course(long id,String title,String discription) {
        this.title=title;
        this.id=id;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Course() {
        super();
    }
}
