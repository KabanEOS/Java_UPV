package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a magnitude in euros and cents: ");
        double eur = input.nextDouble();

        System.out.println("The optimal set of bills is: ");
        int b50  = (int) (eur/50);
        if (b50 != 0) System.out.println( b50 + " bill of 50 euros");

        int b20 = (int) ((eur%50)/20);
        if (b20 != 0) System.out.println( b20 + " bill of 20 euros");

        int b10 = (int) (((eur%50)%20)/10);
        if (b10 != 0) System.out.println( b10 + " bill of 10 euros");

        int b5 = (int) ((((eur%50)%20)%10)/5);
        if (b50 != 0)System.out.println( b5 + " bill of 5 euros");

        int c2 = (int) (((((eur%50)%20)%10)%5)/2);
        if (c2 != 0) System.out.println( c2 + " coin of 2 euros");

        int c1 = (int) ((((((eur%50)%20)%10)%5)%2)/1);
        if (c1 != 0) System.out.println( c1 + " coin of 1 euro");

        int c05 = (int) (((((((eur%50)%20)%10)%5)%2)%1)/0.5);
        if (c05 != 0) System.out.println( c05 + " coin of 50 cents");

        int c02 = (int) ((((((((eur%50)%20)%10)%5)%2)%1)%0.5)/0.2);
        if (c02 != 0) System.out.println( c02 + " coin of 20 cents");

        int c01 = (int) (((((((((eur%50)%20)%10)%5)%2)%1)%0.5)%0.2)/0.1);
        if (c01 != 0) System.out.println( c01 + " coin of 10 cents");

        int c005 = (int) ((((((((((eur%50)%20)%10)%5)%2)%1)%0.5)%0.2)%0.1)/0.05);
        if (c005 != 0) System.out.println( c005 + " coin of 5 cents");

        int c002 = (int) (((((((((((eur%50)%20)%10)%5)%2)%1)%0.5)%0.2)%0.1)%0.05)/0.02);
        if (c002 != 0) System.out.println( c002 + " coin of 2 cents");

        int c001 = (int) ((((((((((((eur%50)%20)%10)%5)%2)%1)%0.5)%0.2)%0.1)%0.05)%0.02)/0.01);
        if (c001 != 0) System.out.println( c001 + " coin of 1 cent");
    }
}