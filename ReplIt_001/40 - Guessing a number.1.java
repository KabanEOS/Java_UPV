package com.madejski;
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        boolean win = true;
        int num = rand.nextInt(1000);
        
        System.out.println("Guess the number! (1-1000)");
        
        while(win){

            int guess = scan.nextInt();

            if (guess == num) {
                System.out.println("Congratulations, you guessed correctly!");
                win = false;
            }
            else if(guess < num ) System.out.println("Bad luck. Try something higher");
            else if(guess > num ) System.out.println("Bad luck. Try something smaller");
            else if(guess <= 0 || guess <1000) System.out.println("Oh, you rebel. Stick to the range!");
        }

    }
}
