package Ex_09_Switch;

public class Lab08_Switch_MultipleMatch {
    public static void main(String[] args) {
        int a= 3;

        switch (a)
        {
            case 02,4,6,8-> System.out.println("Even");
            case 01,03,5,7,9-> System.out.println("Odd");
            default -> System.out.println("not allowed");
            // No need of break
            //sout should be in same line
        }
    }
}
