package javabasic.session1.session2;

/**
 * Created by arash on 27.05.21.
 */

public class App {
    /*do{

    }while()*/

    /*while(){

    }*/

    int [] array = new int [10]; // type [] name = new type [length];
    float [] floats =  new float[4];
    char[] chars = new char[10];

    static void fun(){

    }

    static void func1(int a , int b) {
        System.out.println(a + b);
    }

    // access-level static return-type name(type parameter1 ,  ... , type parameterN)
    // //           void        sum(int num1 , int num2) --> print

  // print sum a,b
    static void sum(int a , int b) {
        System.out.println(a + b);
    }

   static void printNumber(int a){
       System.out.println(a);
   }

   static int absoluteNumber(int a){
        if(a < 0)
            return -a;
        return a;
   }

   static void absoluteNumber2(int a) {
       if (a < 0) {
           System.out.println(-a);
       } else {
           System.out.println(a);
       }
   }


    // return sum a,b
    static int sum1(int a, int b) {
        return a + b;
    }

    // input : array of int , output : print array
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // --a,b-->{ print }---> return = void




    // a,b --> c : output : array[0]=a ; array[1]=b;
    static int[] fun(int a , int b) {
        int[] array = {a, b};
        return array;
    }


    // 1,2,3,4,5,6,7 , 3  --> 5,6,7,1,2,3,4

    // {1,2,3}
    // input : array of int : output : array of even numbers
    static int[] evenArray(int[] array) {
        int[] result = new int[array.length];
        //result[0,1,2,..,length-1];
        //result[0]
        //result[1]
        //..
        //result[result.length - 1]
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i];
            }
        }
        return result;
    }

    // input : array of int , int a : output : boolean
    //[1,2,3] 2
    static boolean isOnArray(int[]array,int a) {
        boolean result = false;
        for (int i = 0; i < array.length && !result; i++) {
            if (a == array[i]) {
                result = true;
            }
        }
        return result;
    }


    // input : array of int  output : length

    static int length(int [] array){
        return array.length;
    }

    // input : array of int , increase all items in array
    static void increaseItems(int [] array){
        for(int i = 0 ; i < array.length ; i++) {
            array[i] += 1;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        evenArray(array);
    }


}
