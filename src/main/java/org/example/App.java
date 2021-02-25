package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*int a =10;
        // primitive data type --> Memory Allocation ( Stack )
        Integer integer; // Wrapper Data Type (Heap)
        // Customize Data Type ? ---> Entity & ... ---> class ---> object
        String s = "java";
        if(a > 0){
            System.out.println("a > 0");
        }else {
            System.out.println(" a <= 0");
        }

        int [] array = new int[5];
        array[0] = 1;
        System.out.println(array.length);

        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
        int i = 0;
        while (array[i] > 0){
            System.out.println(array[i++]);
        }*/
       // 0000001 | 000002 | time ----> 0000003 |

        Time time = new Time(8, 20, 13); // instance of Time , "new" is keyword in java
        Time time1 = new Time(8,20,13);
        System.out.println(time.equals(time1));
        //toString
        System.out.println("this is time instance " + time);
        Time time2 = null; // null ---> ref type

        System.out.println(time2);
        // B b = new B();
        // A a = new A();
        // a.setB(b);
        int a = 10;
        // stack (ref of obj , primitive data type ) , heap

    }
}
