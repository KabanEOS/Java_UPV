package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Scanner for reading from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Variables
        double side1, side2, h;

        // Asking for the two sides of the triangle
        System.out.println("Give me one side:");
        side1 = keyboard.nextDouble();
        System.out.println("Give me the other side:");
        side2 = keyboard.nextDouble();
        
        //i made an assumption that this triangle is rectangular and I used statement reversed pitagorei

        h = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println(h);


    }
}