import java.util.Scanner;

public class Lab05_Vowel_with_Switch {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter charater");
        char ch= n.next().toLowerCase().charAt(0);

        switch(ch)
        {
            case 'a'.'e','i','o','u' ->System.out.println("Vowel")
                    default-> System.out.println("comsonent");
        }
    }
}
