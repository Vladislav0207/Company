package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("имя " + name + "\nвозраст " + age);
    }
}
