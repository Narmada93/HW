package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        //Sum of the factorial digits

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number");
        int number = sc.nextInt();

        long fact = 0;

        for (int j=1;j<=number;j++){
            fact = fact+j;
        }
        System.out.println( " fact of sum is "+ fact);
        sc.close();
    }
}
