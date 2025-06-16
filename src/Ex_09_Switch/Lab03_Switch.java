package Ex_09_Switch;

import java.util.Scanner;

public class Lab03_Switch {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Enter the Browser Used");
        String browser= value.next();
        browser= browser.toLowerCase();

        switch (browser)
        {
            case "chrome":
                System.out.println("open chrome");
                System.out.println("open tab");
                System.out.println("etc");
                break;
            case "edge":
                System.out.println("open edge");
                System.out.println("open application");
                System.out.println("etc");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
