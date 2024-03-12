package com.myblogapp12;

public class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
