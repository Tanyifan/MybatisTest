package com.tan.entity;

public class StudentClass {
    private Integer classid;

    private String classname;

    public StudentClass(Integer classid, String classname) {
        this.classid = classid;
        this.classname = classname;
    }

    public StudentClass() {

    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }
}