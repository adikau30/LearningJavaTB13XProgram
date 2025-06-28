package Ex_13_Functions;

public class Lab04_AllFunctions_03 {
    // user defined fuctions
    // 1. Without parameters without return type
    // 2. Without parameters with return type
    // 3. With parameters without return type
    // 4. With parameters with return type
    public static void main(String[] args) {
        // 1. Without parameters without return type
        wop_wor();


        // 2. Without parameters with return type
        String msg= wop_wr();
        System.out.println(msg);


        // 3. With parameters without return type
        wp_wor("aditya", 23, 7677);


        // 4. With parameters with return type
        int sum= wp_wr_sum_of_two_numbers(4,5);
        int sum2= wp_wr_sum_of_two_numbers(56,87);
        System.out.println(sum);
        System.out.println(sum2);

    }
    static void wop_wor()
    {
        System.out.println("type 1- hi, how are you");
    }


    static String wop_wr()
    {
        System.out.println("type 2- hi, how'dy");
        return "hi again i return";
    }


    // 3. With parameters without return type
    static void wp_wor(String name, int age, double salary)
    {
        System.out.println("Name ->" + name + "\nYour age is->" + age + "\nYour salary is->" + salary );
    }
    // 4. With parameters with return type
    static int wp_wr_sum_of_two_numbers(int a, int b)
    {
        return a+b;
    }

}
