package Ex_11_While_Loop;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab02_While_IQ_Factorial {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        if(!n.hasNextInt()){
            System.out.println("enter integer PLEASE");
            return;
        }
        int number= n.nextInt();
        if (number<0)
        {
            System.out.println("factorial of negative not allowed");
            return;
        }

        long factorial= 1;
        if (number == 0)
        {
            System.out.println(factorial);
        }else{
            for (int i = 1; i <= number ; i++) {
                factorial= factorial* i;

            }
        }
        System.out.println("factorial->" + factorial);
    }
}
