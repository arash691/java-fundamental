package org.example.session_05;

public class Rectangle extends Shape {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public Double getArea() {
        return (double) (w * h);
    }
}
