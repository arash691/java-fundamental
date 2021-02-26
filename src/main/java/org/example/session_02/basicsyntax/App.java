package org.example.session_02.basicsyntax;

public class App {

    // for each class we should define main method , JVM find out with this method to run our program.
    // this is important for JVM the signature of this method
    public static void main(String[] args) {

        // declare variables :
        // primitive data types : int , boolean , char , byte , long , double , float

        int number = 100;
        boolean flag = true;
        char c = 'f';
        float f1 = 1.2f;   // used ..f end of your value
        double d1 = 3.14d; // used ..d end of your value

        // to print something in console you can use System.out
        System.out.println(number);
        System.out.print(false);

        // conditional statements
        // a > b , a < b , a >= b , a <= b , a == b
        // a != b
        // (a > 10 ) && (b < 0) , (a > b) || (b > 100)
        if(/*your logical expression*/ number > 1000){

        }else {

        }
        // loop

        for(int i = 0 ; i < 100 ; i++){
            System.out.println(i);
        }
        // pay attention to ;
        // for(int i = 0 ; i < 100 ; i++); ---> infinite loop

        // short form : i = i + 1; --> i += 1; or i++;
        // i++ vs ++i
        int i = 0;
        while (i < 100){
            System.out.println(i);
            i = i + 1 ; // short form i += 1; or i++;
        }
        int a = 0;
        do{
            a++;
            if(a > 100)
                break;
        }while (true);

        // break , continue

        // arrays

        //  array type [ ] array name = new array type [ length ] ;
        int [] arr = new int[100];
        // arr[0] , arr[1] , ... , arr[99]
        arr[0] = 1;
        arr[1] = 2;
        char [] chars = new char[100];

    }
}
