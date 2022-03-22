package com.knoldus.java.lambdaStream;

/**
 * created Employee class having diff entities like age,name,sureName
 */
public class Employee {
    private int age;
    private String name,sureName;
    private double salary;

    public Employee(int age, String name, String sureName,double salary) {
        this.age = age;
        this.name = name;
        this.sureName = sureName;
        this.salary = salary;
    }

    /**
     * default constructor
     */
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
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
