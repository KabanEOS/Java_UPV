package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Reading
        while(true) {
            try {
                System.out.println("Write your string Sir: ");
                String s = new Scanner(System.in).nextLine();

                int i = Integer.parseInt(s);

                System.out.println(i);
            } catch (NumberFormatException e) {
                System.out.println("Noonononono my friend, you have to write an int number!");
            }
        }
    }
}