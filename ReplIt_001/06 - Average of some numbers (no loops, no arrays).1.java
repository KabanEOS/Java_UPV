package com.madejski;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("I'm going to count averange from your numbers");


            System.out.print("Give me 1 number: ");
            float num1 = scanner.nextFloat();

            System.out.print("Give me 2 number: ");
            float num2 = scanner.nextFloat();

            System.out.print("Give me 3 number: ");
            float num3 = scanner.nextFloat();

            System.out.print("Give me 4 number: ");
            float num4 = scanner.nextFloat();

            System.out.print("Give me 5 number: ");
            float num5 = scanner.nextFloat();

            System.out.print("Give me 6 number: ");
            float num6 = scanner.nextInt();

            System.out.print("Give me 7 number: ");
            float num7 = scanner.nextFloat();

            System.out.print("Give me 8 number: ");
            float num8 = scanner.nextFloat();

            System.out.print("Give me 9 number: ");
            float num9 = scanner.nextFloat();

            System.out.print("Give me 10 number: ");
            float num10 = scanner.nextFloat();

        System.out.println("Average of yor numbers equals: "+ ((num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10));

  }
}

// Write a program able to ask for 10 real numbers and print the average of them.
// Please, in case you know loops and arrays, don't use them.