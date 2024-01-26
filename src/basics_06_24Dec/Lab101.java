package src.basics_06_24Dec;

public class Lab101 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        System.out.println("length of array " + arr1.length);

        // using for loop
        for (int i=0; i < arr1.length; i++) {  //i <= arr1.length - 1

            System.out.println(arr1[i]);
        }
        System.out.println( " Reference is "+ arr1); //  it gives memory allocation

    }
}
