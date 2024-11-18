package com.quest.oops.test1;

public class MountainBike extends Bicycle {
    private int speed;
    public MountainBike(String color, int gear, int speed) {
        super(color, gear);
        this.speed = speed;
    }
    public void getSpeed() {
        System.out.println("Speed: " + this.speed);
    }
    @Override
    public void getColor() {
        super.getColor();
        System.out.println("The speed of bicycle is " + this.speed);
    }
}
