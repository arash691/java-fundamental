package negin.session1;

/**
 * Created by arash on 20.05.21.
 */

public class App {
    public static void main(String[] args) {
        // variables
        // type {int , float , double , char , boolean } name { 1negin , #number , -i }
        /*type int : numbers ---> -x , +x : 128 , 1000 , -1 , -1236666
         * type float : 3.14 , 3.85 ...
         * type double : 3.14151617
         * type char : ascii code 'a' '^'
         * boolean : true , false
         *  */

        // type name; type name = value;

        /*int a = 1;
        int b = 2;
        // language , IDE visual c++.net

        float f1 = 3.14f;
        double d1 = 3.141516;

        boolean b1; // flase

        // System.out.println(); // Console.writeLine C#

        int c = a + b;
        System.out.println(c);

        //////////////////////////////////

        *//*
         * if(logical exp ) {
         *
         * }else{
         *
         * }

         * *//*

        if(10 > 9){
            System.out.println("10 > 9");
        }else{
            System.out.println("!");
        }

        if(10 > a){
            System.out.println("1");
        }else if(10 > 1 && 10 < a){
            System.out.println("0");
        }
        else if( 10 < b){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

        int i = 0;
        switch (i){
            case 0:
                System.out.println(0);
                break;
            case 1 :
                System.out.println(1);
                break;
            default:
                System.out.println("end");
        }*/
        // 0 -> shanbe
        // 1 -> 1shanbe
        // 2 -> 2shanbe
        // 3 -> 3shanbe
        //4 - > 4shanbe
        // 5 -> 5shanbe
        // 6 -> jome
       /* System.out.println("Plz enter number ...");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a){
            case 0 :
                System.out.println("shanbe");
                break;
            case 1 :
                System.out.println("1shanbe");
                break;
            case 2 :
                System.out.println("2shanbe");
                break;
            default:
                System.out.println("invalid number");
        }*/

        // for ( 1 counter = init ; 2 counter logical expresion ; 4 counter plus ++ , -- ) {
        //
        // 3 }
        // 0 , 1 , 2 , ... , 9
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(i + 2);
            int k = i * 9;
            System.out.println(k);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i--) {
            System.out.println(i); // 0 , -1 , -2 , ... , min int
        }
        int j = 0; //1
        for (; ; ) {
            if (j < 10) //2
                System.out.println(j);
            else
                break; // 3
            j++; // 4
        }



        // 0 + 1 + 2 + 3 + 4
        int s = 0; // 0+1+2+3 ... + 9
        for (int i = 0; i < 5; i++) {
            s += i;
        }
        System.out.println(s); // 10


        s = 0;
        for (int i = 0; i < 5; i++) {
            s += i;
            if (i == 3)
                break;
        }
        System.out.println(s); // 0 + 1 + 2 + 3 = 6

        s = 0;
        for (int i = 0; i < 5; i++) {

            if (i == 3)
                continue;
            s += i;

        }*/
        //*
        // s=0;i=0--> s=0 p : 0
        // s=0;i=1 --> s=1 p : 1
        // s=1;i=2 --> s=3
        // */

        /*for(int i = 1000 ; i <= 2000 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
        /*
          i= 0
        * s = 0
        * if = false ---> else 0+0 = 0
        *
            i = 1
            s = 0
            if false --> else 0+1 = 1

         i = 2
         s = 1
         if false --> else 2+1 = 3
         s=3
         i = 3
         if true
        * */
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }

        int m = 5, x = 5;
        switch (m)
        {
            case 1: x++;
            case 5: x += 2;
            case 3: x += 3;
            case 4: x += 5; break;
            default: x++;
        }
        System.out.println(x);
    }
}
