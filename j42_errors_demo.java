import java.util.Scanner;

public class j42_errors_demo {
    public static void main(String[] args) {
        // Syntax Error
        // int a = 5 // semi colon error
        // a = 5; // a is not declared

        // Logical Error
        // Write a program to print all prime numbers between 1-10
        /*
         * for (int i = 1; i < 5; i++)
         * System.out.println(2 * i + 1); // this program is not for prime because in
         * output 9 is also shown and 9 is
         * // not prime
         */

        // run time error
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("integer part of 1000 is divided by " + 1000 / k);
        sc.close();

    }

}
