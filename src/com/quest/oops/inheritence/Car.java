package com.quest.oops.inheritence;

public class Car extends Vehicle {
    private String model;

    public Car(String color, int seats, String model) {
        super(color, seats);
        this.model = model;
    }

    public void honk() {
        System.out.println("Car honked.");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car started.");
    }

    @Override
    public void drive() {

    }
}

