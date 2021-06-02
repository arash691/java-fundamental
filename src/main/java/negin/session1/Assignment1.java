package negin.session1;

/**
 * Created by arash on 26.05.21.
 */

public class Assignment1 {
    public static void Q1(int w, int l) {
        for (int i = 0; i < l; i++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < w - 2; i++) {
            System.out.print("#");
            for (int j = 0; j < l - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        if( w > 1) {
            for (int i = 0; i < l; i++) {
                System.out.print("#");
            }
        }
    }
    public static void Q2(int n){

    }

    public static void Q4(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--)
            factorial *= i;
        System.out.println(factorial);
    }

    public static void Q5() {
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == i / 100)
                System.out.println(i);
        }
    }

    

    public static void main(String[] args) {

    }
}
