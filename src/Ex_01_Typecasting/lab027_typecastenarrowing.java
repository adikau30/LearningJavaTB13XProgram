package Ex_01_Typecasting;

public class lab027_typecastenarrowing {
    public static void main(String[] args) {
        int val= 300;
       // byte b= val; //narrowing (int -> byte)- implicit casting not allowed
        byte b1 = (byte)val; // Narrowing (int -> byte - explicit casting is not allowed
        // data loss
        //300 converted into binary number
        System.out.println(b1);
    }
}
