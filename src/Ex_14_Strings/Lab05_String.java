package Ex_14_Strings;

public class Lab05_String {
    public static void main(String[] args) {
        String s1= "hello";
        String s2= "hello"; //both are in string pool constant so same place stored


        String s3= new String("hello");// object area
        String s4= new String("hello");// same name but still different object area
        String s5= new String("Hello");// again same but different object are

        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s2==s5);
        System.out.println(s1==s2);// in same scp
        System.out.println(s4==s5);
        // == comparison of loactions

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equalsIgnoreCase(s5));


    }
}
