package src.OOPs_07_30Dec;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {


        // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
        //  0 -> X
        // 1 -> X
        // 2 -> prime?
        // 3 -> ?
        // 4 -> ?


        int i = 0;
        int m = 0;
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int n = sc.nextInt();

        //        17 -> 2 to 17/2 -> num%i == 0 -> not a prime

        m=n/2;

        if( n==0 || n==1 ){
            System.out.println( n + " is Not a prime number");
        }else{

            for( i=2; i<=m; i++){
                if( n%i==0 ){
                    System.out.println( n + " is Not a prime number" );
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0){
            System.out.println(n + " is a prime number");
        }

    }
}
