package com.company;

public class Plane {
    String mark;
    int places;
    int mass; //weight

    public Plane(String mark, int places, int mass) {
        this.mark = mark;
        this.places = places;
        this.mass = mass;
    }

    //То же самое, toString()
    void info() {
        System.out.println("марка " + mark + "\nместа " + places+"\nмасса "+mass);
    }
}
