package com.ing.zoo;

public class Zebra extends Animal {
    public Zebra(String name) {
        this.name = name;
        foodType = FoodType.HERBIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eat(String food) {
        if (food.equals("leaves")) {
            eatText = "munch munch zank yee bra";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat leaves");
        }
    }
}
