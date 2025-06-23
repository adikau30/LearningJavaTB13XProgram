import java.util.Scanner;

public class Lab04_Do_While_Loop_Vowel {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("enter the value");
        char ch= n.next().toLowerCase().charAt(0);
        if(ch>= 'a' && ch<='z')
        {
            System.out.println("consonent"+ ch);
        }
        else if (ch== 'a'|| ch== 'e'|| ch== 'i'|| ch== 'o'|| ch== 'u') {
            System.out.println("vowel" + ch);
        }else
        {
            System.out.println("invalis character");
        }

    }
}
