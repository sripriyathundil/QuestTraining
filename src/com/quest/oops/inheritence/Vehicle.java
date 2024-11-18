package com.quest.oops.inheritence;

public abstract class Vehicle {
    String color;
    int seats;
    public Vehicle(String color, int wheels) {
        this.color = color;
        this.seats = seats;
    }

    public void start() {
        String s = String.format("The vehicle colour is %s & number of seats is %d ",color,seats);
        System.out.println(s);
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public abstract void drive();
}

