package org.example.session_05;

public class App {
    public static void main(String[] args) {
      /*Dog dog = new Dog();
      dog.talk();

      Cat cat = new Cat();
      cat.talk();*/

      Circle circle = new Circle(3);
        System.out.println(circle.getArea());

      Rectangle rectangle = new Rectangle(3,6);
        System.out.println(rectangle.getArea());

        //Shape shape = new Shape(); is wrong
        // Interface --> Polymorphism
        // Shape shape = new Circle(2);


    }
}
