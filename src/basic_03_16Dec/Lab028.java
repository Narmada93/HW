package src.basic_03_16Dec;

public class Lab028 {
    public static void main(String[] args) {


        int course = 100;
        float GST =0.1845f;
        float total = course + GST*course;
      //  int total = course + (int) GST*course;  If you are using smaller bucket u will loose data
        System.out.println(total);
    }
}
