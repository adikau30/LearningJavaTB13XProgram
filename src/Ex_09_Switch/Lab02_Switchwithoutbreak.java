package Ex_09_Switch;

import java.util.Scanner;

public class Lab02_Switchwithoutbreak {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Enter Value");
        int day= value.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Not allowed");
        }

    }
}
