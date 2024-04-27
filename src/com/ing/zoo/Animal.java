package com.ing.zoo;

public abstract class Animal {
    protected String name;
    protected String helloText;
    protected String eatText;
    protected enum FoodType {CARNIVORE, HERBIVORE, OMNIVORE}
    protected FoodType foodType;
    public abstract void sayHello();
    public boolean isCarnivore() {
        return foodType == FoodType.CARNIVORE;
    }

    public boolean isHerbivore() {
        return foodType == FoodType.HERBIVORE;
    }

    public boolean isOmnivore() {
        return foodType == FoodType.OMNIVORE;
    }

    public void performTrick(){}

    public void eat(String food){}

    public String getName() {
        return name;
    }
}
