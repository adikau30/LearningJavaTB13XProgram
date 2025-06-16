package EX_01_Java_Basic;

public class lab21_concat_plus {
    public static void main(String[] args) {
        String first_name = "aditya";
        String Second_name = "kaushik";

        int a= 10;
        int b= 20;

        System.out.println(first_name + Second_name +a +b);
        System.out.println(a +b + first_name + Second_name);


        System.out.println(first_name + Second_name + (a +b));
        //Bodmas
    }
}
