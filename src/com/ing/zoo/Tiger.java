package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal {
    public String trick;

    public Tiger(String name) {
        this.name = name;
        foodType = FoodType.CARNIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }


    public void eat(String food) {
        if (food.equals("meat")) {
            eatText = "nomnomnom oink wubalubadubdub";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat meat");
        }
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
