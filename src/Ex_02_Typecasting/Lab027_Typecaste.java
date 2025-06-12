package Ex_02_Typecasting;

public class Lab027_Typecaste {
    public static void main(String[] args) {
       byte b = 10;
       int a=b;
       //widening -> Implicit widening
        int a1= (int)b;
        //widening -> explicit casting
        System.out.println(a);
        System.out.println(a1);
    }
}
