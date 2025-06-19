package Ex_11_While_Loop;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Lab04_While_Guess_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;


        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempt = 0;

        while (true) {

            guess = n.nextInt();
            attempt++;

            if (numbertoguess > guess) {
                System.out.println(" Number to low");
            } else if (numbertoguess < guess) {
                System.out.println(" Number to high");
            } else {
                System.out.println("Guessed it right" + attempt + "Attempt");
                break;
            }


        }

    }
}
