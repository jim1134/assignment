package com.ing.zoo;

public class Hippo extends Animal {
    public Hippo(String name) {
        this.name = name;
        foodType = FoodType.HERBIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eat(String food) {
        if (food.equals("leaves")) {
            eatText = "munch munch lovely";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat leaves");
        }
    }
}
