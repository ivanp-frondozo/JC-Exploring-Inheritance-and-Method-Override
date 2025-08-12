package org.example;

abstract class Animal {

    public abstract String makeSound();

    public void breathe() {
        System.out.println("Inhale...Exhale...");
    }
}

class Dog extends Animal {
    private String sound = "Woof!";

    @Override
    public String makeSound() {
        return sound;
    }
}
