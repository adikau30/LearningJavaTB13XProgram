package EX_06_UserInput;

import java.util.Scanner;

public class Lab_userinput_Scanner02 {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Enter value");
        String s= value.next();
        System.out.println(s);

        System.out.println("enter integer");
        int s1= value.nextInt();
        System.out.println(s1);

        System.out.println("enter double");
        double s2= value.nextDouble();
        System.out.println(s2);
    }
}
