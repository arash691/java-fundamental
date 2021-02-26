package org.example.session_04.staticmembers;
// 5 ways to init properties in class
public class Test {
    int a = 10; // inline
    static int b = 20;
    int c;
 // block
    {
        c = 30;
    }

    static int d;
// static block
    static {
        d = 40;
    }

    int e;

    Test() {
        e = 50;
    }
}
