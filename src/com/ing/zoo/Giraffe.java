package com.ing.zoo;

public class Giraffe extends Animal {
    public Giraffe(String name) {
        this.name = name;
        this.foodType = FoodType.HERBIVORE;
    }

    @Override
    public void sayHello() {
        System.out.println("happy giraffe noises");
    }

    public void eat(String food) {
        if (food.equals("leaves")) {
            eatText = "delicious";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat leaves");
        }
    }
}