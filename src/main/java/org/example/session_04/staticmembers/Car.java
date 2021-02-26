package org.example.session_04.staticmembers;
// t1 << t2
// Class -- Object

// classloader
public class Car {
    private static int yearOfDesign;
    private String color; // allocate memory after call constructor

    public static void fun(){
        // this --> reference of current object
        yearOfDesign = 10;
    }

    public void fun2(){
        yearOfDesign = 10;

    }
    public static void main(String[] args) {
        Car car = new Car();
        Car.yearOfDesign = 1;
        Car.fun();
    }
}


