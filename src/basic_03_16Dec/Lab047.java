package src.basic_03_16Dec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        // Take input from user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int a = sc.nextInt();

        //int a =34;

        if(a%2==1){
            System.out.println("ODD number");
        }else{
            System.out.println("Even Number");
        }
    }
}
