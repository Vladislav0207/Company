package com.company;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>(2);
        people.add(new Person("лох", 5));
        people.add(new Person("пидр", 9));
        List<Plane> plane = new ArrayList<>(2);
        plane.add(new Plane("fly", 300, 300));
        plane.add(new Plane("fuck", 299, 299));
        Flight[] flight = new Flight[4];
        GregorianCalendar calendar1 = new GregorianCalendar(2020, Calendar.JANUARY, 25);
        flight[0] = new Flight(plane.get(0).mark, calendar1, 100);
        GregorianCalendar calendar2 = new GregorianCalendar(2020, Calendar.FEBRUARY, 24);
        flight[1] = new Flight(plane.get(0).mark, calendar2, 100);
        GregorianCalendar calendar3 = new GregorianCalendar(2020, Calendar.MAY, 23);
        flight[2] = new Flight(plane.get(0).mark, calendar3, 100);
        GregorianCalendar calendar4 = new GregorianCalendar(2020, Calendar.AUGUST, 22);
        flight[3] = new Flight(plane.get(0).mark, calendar4, 100);
        System.out.println("И так, здравствуйте уважаемый пидарасс\n Вас приветсвует ваша ебаная в анал авиакомпания <попутного витру тибе в сpаку>");
        while (true) {
            System.out.println("1 - массив сотрудников\n 2 - коллекция самолетов\n 3 - список рейсов\n 4 - меню добавления\n 5 - выход");
            int n = in.nextInt();
            switch (n) {
                case 1://сотрудники
                    for (int i = 0; i < people.size(); i++) {
                        people.get(i).info();
                    }
                    break;
                case 2://самолеты
                    for (int i = 0; i < plane.size(); i++) {
                        plane.get(i).info();
                    }
                    break;
                case 3://рейсы
                   GregorianCalendar t= new GregorianCalendar();
                   for (int y=0;y<3;y++){
                    for (int l = 0; l < 3; l++) {
                        if (flight[l].date.before(flight[l + 1].date)) {
                            t = flight[l].date;
                            flight[l].date = flight[l + 1].date;
                            flight[l + 1].date = t;
                        }
                    }
                    }
                    for (int i = 0; i < 4; i++) {
                        flight[i].info();
                    }

                    break;
                case 4://добавить
                    System.out.println("1 - добавить сотрудника\n 2 - добавить самолет");
                    int m = in.nextInt();
                    switch (m) {
                        case 1://доб сотрудника
                            System.out.println("сколько сотрудников хочешь добавить, хуйло?");
                            int k = in.nextInt();
                            for (int i = 0; i < k; i++) {
                                System.out.println("добавление сотрудника №" + (i + 1));
                                System.out.println("имя");
                                String name1 = in.next();
                                System.out.println("возраст");
                                int age1 = in.nextInt();
                                people.add(new Person(name1, age1));
                            }

                            break;
                        case 2://доб самолет
                            System.out.println("сколько самолетов хочешь добавить, хуйло?");
                            int h = in.nextInt();
                            for (int i = 0; i < h; i++) {
                                System.out.println("добавление самолета №" + (i + 1));
                                System.out.println("марка");
                                String mark1 = in.next();
                                System.out.println("кол-во мест");
                                int places1 = in.nextInt();
                                System.out.println("масса(нахуя она тебе сдалась я конечно не знаю)");
                                int mass1 = in.nextInt();
                                plane.add(new Plane(mark1, places1, mass1));
                            }
                            break;
                    }
                    break;
            }
            if (n == 5) {
                break;
            }
            if (n > 5 || n < 0) {
                System.out.println("пошол-ка ты нахой говно ибливое");
            }
        }
    }
}

