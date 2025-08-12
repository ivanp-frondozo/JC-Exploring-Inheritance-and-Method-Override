package org.example;

public class Bicycle extends Vehicle {
    protected String vehicleName = "Bicycle";

    public void ringBell() {
        System.out.print(vehicleName + " says: Ring ring!");
    }

    @Override
    public void honk() {
        System.out.print(vehicleName + " says: ");
        super.honk();
    }

}
