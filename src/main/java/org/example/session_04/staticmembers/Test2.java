package org.example.session_04.staticmembers;
// static : 1 - inline 2 - block
// non-static : 1 - inline 2- block 3- default constructor
public class Test2 {
    int a = 10;
    static int b;

    static {
        b = 20;
        System.out.println("A");
    }

    {
        a = b;
        System.out.println("B");
    }

    Test2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("C");
    }

    Test2(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Q1 : Arezoo  : A , 11 , 10 , 10 , C , null X
        // Farshad : A , B , 11 , 11 , C , null  X
        // result : A
       // Test2.b = 11;

        // Q2
        // Farshad  : A , B , 20 , 20 , C
        // Arezoo : -
        // result : A , B , 20 , 20 , C
        // new Test2();

        // Q3
         new Test2("K");
        // result :  A,B,K
        // Q4

    }
}
