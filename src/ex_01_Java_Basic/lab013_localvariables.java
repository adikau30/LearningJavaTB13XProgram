package ex_01_Java_Basic;

public class lab013_localvariables {
    public static void main(String[] args) {
        int a= 10;
        {
            int b= 90;
            System.out.println(b);
            System.out.println(a);
        }
        int b= 23;
        System.out.println(b);
    }
}
