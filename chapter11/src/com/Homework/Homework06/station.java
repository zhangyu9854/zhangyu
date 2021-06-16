package com.Homework.Homework06;

public class station {
    public static Horse gethorse() {
        Horse horse = new Horse();
        return horse;
    }

    public static Boat getboat() {
        Boat boat = new Boat();
        return boat;
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void Overriver() {
        if (!(vehicles instanceof Boat)) {
            station.getboat().work();
        } else {
            vehicles.work();
        }
    }

    public void moment() {
        if (vehicles instanceof Horse) {
            vehicles.work();
        } else {
            station.gethorse().work();
        }

    }
}
