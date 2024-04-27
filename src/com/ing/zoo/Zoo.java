package com.ing.zoo;

import java.util.HashMap;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        HashMap<String, Animal> animals = new HashMap<>();
        animals.put("henk", new Lion("henk"));
        animals.put("else", new Hippo("else"));
        animals.put("dora", new Pig("dora"));
        animals.put("wally", new Tiger("wally"));
        animals.put("marty", new Zebra("marty"));
        animals.put("jimmy", new Monkey("jimmy"));
        animals.put("bob", new Giraffe("bob"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.startsWith(commands[0] + " ")) {
            String animalName = input.substring(commands[0].length() + 1).trim();
            for (Animal animal : animals.values()) {
                if (animal.getName().equalsIgnoreCase(animalName)) {
                    animal.sayHello();
                    break;
                }
            }
        } else {
            switch (input) {
                case "hello":
                    for (Animal animal : animals.values()) {
                        animal.sayHello();
                    }
                    break;
                case "give leaves":
                    for (Animal animal : animals.values()) {
                        if (animal.isHerbivore() || animal.isOmnivore()) {
                            animal.eat("leaves");
                        }
                    }
                    break;
                case "give meat":
                    for (Animal animal : animals.values()) {
                        if (animal.isCarnivore() || animal.isOmnivore()) {
                            animal.eat("meat");
                        }
                    }
                    break;
                case "perform trick":
                    for (Animal animal : animals.values()) {
                        animal.performTrick();
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
        }
    }
}
