package com.ing.zoo;

public class Lion extends Animal {
    public Lion(String name) {
        this.name = name;
        foodType = FoodType.CARNIVORE;
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eat(String food) {
        if (food.equals("meat")) {
            eatText = "nomnomnom thx mate";
            System.out.println(eatText);
        } else {
            System.out.println("i only eat meat");
        }
    }
}
