package EX_06_UserInput;

import java.util.Scanner;

public class Lab_userinput_Scanner {
    public static void main(String[] args) {
        Scanner age1 = new Scanner(System.in);
        System.out.println("enter you age");

        int age = age1.nextInt();
        String canivote = age>=18 ? "yes":"no";
        System.out.println(canivote);
    }
}
