package Ex_09_Switch;

public class Lab07_Switch_JDKabove13_arrow {
    public static void main(String[] args) {
        int a= 3;

        switch (a)
        {
            case 1-> System.out.println("Matching");
            case 2-> System.out.println("Not Matching");
            case 3-> System.out.println(a);
            default -> System.out.println("not allowed");
            // No need of break
            //sout should be in same line
        }
    }
}
