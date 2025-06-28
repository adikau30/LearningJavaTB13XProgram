package Ex_13_Functions;

import java.util.Scanner;

public class lab06_function_arth {
    public static void main(String[] args) {
        //create a function of add, sub, multiply, modulus
        // with parameter a, b (take paramter from users

        // logic building
        // a, b- int- scanner
        // int- variable results

        // step 2- rough logic- create function
        // function- type 4th- with parameter with return

        //step 3- write code- edge cases


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number 1");

        int a= 0;
        if(scanner.hasNextInt())
        {
            a= scanner.nextInt();
        }
        else
        {
            System.out.println("enter integer only");
            System.exit(0);
        }
        System.out.println("Enter Number 2");

        int b= 0;
        if(scanner.hasNextInt())
        {
            b= scanner.nextInt();
        }else
        {
            System.out.println("enter integer only");
            System.exit(0);
        }

        int result_sum= sum(a,b);
        System.out.println(result_sum);

        int result_sub=sub (a,b);
        System.out.println(result_sub);

        int result_multiply= multiply(a,b);
        System.out.println(result_multiply);

        int result_mod=mod (a,b);
        System.out.println(result_mod);

        int result_div= divide(a,b);
        System.out.println(result_div);




    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }static int multiply(int a, int b)
    {
        return a*b;
    }static int mod(int a, int b)
    {
        return a%b;
    }
    static int divide(int a, int b)
    {
        if (b==0) {
            throw new ArithmeticException("b can't be zero");
        }
        return a/b;
    }
}
