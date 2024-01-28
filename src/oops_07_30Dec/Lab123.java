package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab123 {

    public static void main(String[] args) {

        // Swaping

        // int a = 10;
        // int b = 23;
        // b = 10 , a = 23


        Scanner sc = new Scanner( System.in);
        System.out.println(" Enter value of a = ");
        int a = sc.nextInt();
        System.out.println(" Enter the value of b = ");
        int b = sc.nextInt();

        a = a*b;
        b = a/b;
        a = a/b;   // its not possible if one of the value is 0

        System.out.println(" Value of a is "+a);
        System.out.println(" Value of b is "+b);

        /*

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter value of a = ");
            int a = sc.nextInt();
            System.out.println(" Enter the value of b = ");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;   // its not possible if one of the value is 0

            System.out.println(" Value of a is " + a);
            System.out.println(" Value of b is " + b);

        }catch(Exception e){
            System.out.println(" Not possible error");
        }


         */
        sc.close();
    }
}
