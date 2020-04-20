package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Flight {
    String planes;
    GregorianCalendar date;
    int close;

    public Flight(String planes, GregorianCalendar date,int close) {
        this.planes = planes;
        this.date = date;
        this.close=close;
    }

    void info() {
        System.out.println("имя " + planes + "\nдата отправления " + date.getTime()+"\nмест занято " + close);
    }
}
