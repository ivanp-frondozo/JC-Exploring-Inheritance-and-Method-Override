package org.example;

public class Vehicle {

    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public void display() {
        System.out.print("I am a " + brand + " " + modelName);
    }
}
