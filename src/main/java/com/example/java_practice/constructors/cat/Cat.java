package com.example.java_practice.constructors.cat;

public class Cat {
    String name;
    Long age;
    String breed = "";

    public Cat() {}

    public Cat(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, Long age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

}
