package Ex_09_Switch;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab01_Switch {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Enter Value");
        int day= value.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
            System.out.println("Not allowed");
                break;
        }

    }
}
