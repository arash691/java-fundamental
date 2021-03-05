package org.example.session_05;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return radius * radius * 3.14;
    }
}
