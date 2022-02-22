package com.knoldus.java.lambdaStream;

public class Employee {
    private int age;
    private String name,sureName;

    public Employee(int age, String name, String sureName) {
        this.age = age;
        this.name = name;
        this.sureName = sureName;
    }
    // default constructor
    public Employee() {
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
