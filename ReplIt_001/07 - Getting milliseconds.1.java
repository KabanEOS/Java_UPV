package com.madejski;
import java.util.Scanner;

        import java.text.NumberFormat;
        import java.util.Arrays;
        import java.util.Date;
        import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Time in milliseconds: ");
        float sec = scanner.nextFloat();
        float msec = sec * 1000;

        System.out.println("Time in milliseconds: " + msec);

  }
}

// Write a program that asks for an amount in seconds and prints the equivalent in milliseconds.