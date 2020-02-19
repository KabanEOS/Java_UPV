package com.madejski;
import java.util.Scanner;
import java.util.Random;
import java.io.*;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write dividend: ");
        int d1 = scan.nextInt();

        System.out.println("Write divisor: ");
        int d2 = scan.nextInt();

        if(d2==0){
            System.out.println("this division is not allowed");
        }else{
            System.out.println(d1 + " / " + d2 + " = " + (Math.floor(d1/d2)) + ", and " + d1%d2 + " as a remainder");
        }

    }
}

// Write a program that asks for two integer number and prints the result of the integer division and also the remainder.
// For example:
// 5 / 2 = 2, and 1 as remainder
// The program has to avoid a division by zero, printing in this case that this division is not allowed.