package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal {
    public String trick;

    public Pig(String name) {
        this.name = name;
        foodType = FoodType.OMNIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eat(String food) {
        if (food.equals("meat")) {
            eatText = "nomnomnom oink thx";
            System.out.println(eatText);
        } else if (food.equals("leaves")) {
            eatText = "munch munch oink";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat meat and leaves");
        }
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
