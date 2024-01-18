package src.basics_06_24Dec;

public class Lab100 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        System.out.println(arr1 == arr2); // not possible lengths and values are same however memory allocation is diff

        int [] arr3 = arr1;
        System.out.println( arr3); // ( arr1 == arr3)possible here we are assigning

        System.out.println(arr1.equals(arr2)); // False Not possible

        // If String ---> True  Values are same
        // If arrays ---> False We don't compare ---- references are not equal
    }
}
