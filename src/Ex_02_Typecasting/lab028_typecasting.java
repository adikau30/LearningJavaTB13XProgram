package Ex_02_Typecasting;

public class lab028_typecasting {
    public static void main(String[] args) {
        long phoneno = 9450421748l;
        //short s= phone
        // implicit narrow not allowed
        short s1= (short)phoneno;
        System.out.println(s1);
    }
}
