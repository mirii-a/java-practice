package com.example.java_practice.constructors.cat;

public class Cat {
    String name;
    Long age;

    public Cat(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
