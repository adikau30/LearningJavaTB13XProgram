package Ex_12_Do_While;

public class Lab01_Do_While_Loop {
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println("This is a body, which will execute one time");
            System.out.println(i);
            i++;
        }while (i<10);
    }

    public static class Lab03_Do_While_Loop {
        public static void main(String[] args) {
            // web automation
            int number = 0;
            // 0-> it can be 0 to 10
            do {
                System.out.println(number);
                // call functional number
                // close the excel file or open file
                number++;
            }while (number<0);
        }
    }
}
