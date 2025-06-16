package Ex_09_Switch;

public class Lab09_Switch_Interview03 {
    public static void main(String[] args) {
        int a=11;
        switch (-1)
        {
            default:
                System.out.println("default");
            break;
            case -1:
                System.out.println("10");
            break;
            case 9:
                System.out.println("9");
            break;
            // a is not  not used at all so -1 -1 will match= 10
        }
    }
}
