package src.oops_10_13th_Jan2024;

public class Lab146 {
    public static void main(String[] args) {

        BlocksClass blocksClass = new BlocksClass();

        // BlocksClass blocksClass
        // if we don't create an object no IIB or default constructor will be called

        new BlocksClass();
        new BlocksClass();// Creating objects 2 times 2 time s execution will be done
        BlocksClass b = null;
        b = new BlocksClass(); //3rd time

    }
}
