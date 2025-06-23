package Ex_12_Do_While;

import java.util.Scanner;

public class Lab02_Do_While_Loop {
    public static void main(String[] args) {
        int a=0;
        // while(a<0)
        // system.out.println(a);
        // a++;
        do {
            System.out.println(a);
            a++;
        }while (a<0);
    }

    public static class Lab05_Vowel_with_Switch {
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
}
