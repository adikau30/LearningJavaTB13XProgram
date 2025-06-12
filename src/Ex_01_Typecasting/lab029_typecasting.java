package Ex_01_Typecasting;

public class lab029_typecasting {
    public static void main(String[] args) {
        int course = 100;
        float GST= 18.45f;
        // int total= course+GST; // Narrow- implicit not possible into to float widening
        int total1= course + (int)GST;
        System.out.println(total1);

        float total2= course+ GST; // widening implicit
       //  float total2= (float)course+ GST; // widening explicit
        System.out.println(total2);
    }
}
