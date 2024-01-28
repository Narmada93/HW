package src.OOPs_07_30Dec;

import java.util.Scanner;

public class Lab122 {

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

        a = a+b;
        b= a-b;
        a = a-b;

        System.out.println(" Value of a is "+a);
        System.out.println(" Value of b is "+b);

        sc.close();
    }
}
