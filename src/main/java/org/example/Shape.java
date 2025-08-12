package org.example;

import static java.lang.Math.PI;

abstract class Shape {
    public abstract double area();

    public String display() {
        return "The area is " + area();
        }
    }

class Circle extends Shape {
    private double radius = 5.0;

    public double area() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length = 4.0;
    private double width = 6.0;

    public double area() {
        return length * width;
    }
}
