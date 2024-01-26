package src.basics_06_24Dec;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

        //take input user marks of 5 subjects and print the marks

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.println(" Enter the 1st subject");
        marks[0] = sc.nextFloat();
        System.out.println(" Enter the 2nd subject");
        marks[1] = sc.nextFloat();
        System.out.println(" Enter the 3rd subject");
        marks[2] = sc.nextFloat();
        System.out.println(" Enter the 4th subject");
        marks[3] = sc.nextFloat();
        System.out.println(" Enter the 5th subject");
        marks[4] = sc.nextFloat();

        for(int i=0; i<marks.length; i++){
            if(marks[i] < 30){
                System.out.println("You are failed" + marks[i]);
            }
            System.out.println(marks[i]);
        }
     sc.close();
    }
}
