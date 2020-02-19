package com.madejski;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your variables here
        double tempC, tempF;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me temperature in Celsius:");
        tempC = keyboard.nextDouble();
        // Calculate and print the equivalent in Fahrenheit

        tempF = (tempC * (9.0 / 5) + 32);
        
        tempF *= 100;

        tempF = Math.round(tempF);

        tempF /= 100;

        System.out.println(tempF);
        
        //rounding numbers dont work in online compilator in opposite to INTELLIJ
    }
}
