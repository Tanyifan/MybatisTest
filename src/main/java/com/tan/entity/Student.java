package com.tan.entity;

public class Student {
    private Integer uid;

    private String name;

    private Integer age;

    private Integer classid;

    public Student(Integer uid, String name, Integer age, Integer classid) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.classid = classid;
    }

    public Student(){
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}