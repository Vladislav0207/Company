package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //Show/PrintInfo
    void info() {
        System.out.println("имя " + name + "\nвозраст " + age);
    }
    
    //Для вывода объекта как строки есть встроенный метод toString(), переопределяешь его вместо info()
}
