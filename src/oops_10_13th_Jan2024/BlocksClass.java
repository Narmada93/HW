package src.oops_10_13th_Jan2024;

public class BlocksClass {


    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlocksClass(){
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");  //Static block will print first only one time
    }

}
