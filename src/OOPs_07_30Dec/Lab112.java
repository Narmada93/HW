package src.OOPs_07_30Dec;

import com.sun.security.jgss.GSSUtil;

public class Lab112 {
    public static void main(String[] args) {


        int c = pramod_sum();  // No arguments
        int c1 = pramod_sum(2); // With 1 argument
        int c2 = pramod_sum(2,9); // With 2 arguments


        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello(); // Call to the function

    }

    static int pramod_sum(int input_1,int input_2){  // Defination of the function
        return  input_1+input_2;
    }

    static int pramod_sum(int input_1){
        return input_1;
    }

    static int pramod_sum(){
        return 99;
    }

    static int pramod_sum(int input_1, int input_2, int c){
        return input_1+input_2+c;
    }

    static void sayHello(){    // viod doesn't contatin restun value
        System.out.println("Say yes");

    }

}
