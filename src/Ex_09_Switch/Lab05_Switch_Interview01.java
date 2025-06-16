package Ex_09_Switch;

public class Lab05_Switch_Interview01 {
    public static void main(String[] args) {
        char c= 'A';
        switch (c)
        {
            case 65:
                System.out.println("Match ASCII");
                // CHARACTER IS ALSO INTERGER A-65
                // boolean is not allowed
                break;
            default:
                System.out.println("No Match");
        }
    }
}
