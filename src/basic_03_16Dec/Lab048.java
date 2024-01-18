package src.basic_03_16Dec;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {


        // Take Take 2 inputs from user and give max out of 2 numbers
        // a,b  a>b--> a else b

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a, b values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println( "Max value is "+ a);
        }else{
            System.out.println(" Max value is "+b);
        }

    }
}
