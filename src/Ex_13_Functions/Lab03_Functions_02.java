package Ex_13_Functions;

public class Lab03_Functions_02 {
    public static void main(String[] args) {
        int result= sum_of_number(3,4);
        System.out.println(result);
        sum_of_number_noreturn(3,5);
        // can not assign to any value as no return

    }
    static int sum_of_number(int a, int b)
    {
        return a+b;
    }
    static void sum_of_number_noreturn(int a, int b)
    {
        System.out.println(a+b);
    }
}
