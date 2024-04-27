package com.ing.zoo;

import java.util.Random;

public class Monkey extends Animal {
    public String trick;

    public Monkey(String name) {
        this.name = name;
        foodType = FoodType.OMNIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "oe oe aa aa";
        System.out.println(helloText);
    }

    public void eat(String food) {
        if (food.equals("meat")) {
            eatText = "yummi delicous";
            System.out.println(eatText);
        } else if (food.equals("leaves")) {
            eatText = "mmmm nice";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat meat and leaves");
        }
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "does a flip";
        } else {
            trick = "climbs a tree";
        }
        System.out.println(trick);
    }
}
