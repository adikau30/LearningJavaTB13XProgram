package Ex_08_If_Else_Conditon;

public class Lab02_If_Else_Conditon_02 {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("User can Vote");
        }
        else
        {
            System.out.println("User can not Vote");
        }
    }
}
