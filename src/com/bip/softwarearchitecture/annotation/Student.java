package com.bip.softwarearchitecture.annotation;

public class Student {
    private int name;

    private int age;

    private String classRoom;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public void showInfoStudent() {
        System.out.println("Student " + this.name + " in class: " + classRoom + " is " + this.age + " year old");
    }
}
