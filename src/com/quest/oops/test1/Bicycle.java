package com.quest.oops.test1;

public class Bicycle {
   String color;
   int gear;
   public Bicycle(String color, int gear) {
       this.color = color;
       this.gear = gear;
   }
   public void getColor() {
       String msg = String.format("The bicycle is %s in color and has %d gears present", color, gear);
       System.out.println(this.color);
       System.out.println(msg);
   }
}