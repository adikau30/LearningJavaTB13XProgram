package Ex_14_Strings;

public class Lab06_String_Functions {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "Hello";
        String s3= new String("Hello");
        System.out.println(s1==s2); //True as String Constant Pool same place
        System.out.println(s1==s3);// false one in scp and one in object area
        System.out.println(s1.equals(s3));// true for equals
    }
}
