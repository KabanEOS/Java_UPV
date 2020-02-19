package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d= 86400, h = 3600, m = 60;
        System.out.println("How many seconds? : ");
        int sec = scan.nextInt();
        System.out.println("In "+ sec + " we have "+ sec/d + "days, " + ((sec%d)/h) + " hours, " + ((sec%d)%h)/m + " minutes and " + (((sec%d)%h)%m) + " seconds.");
    }
}


// Transforming time magnitudes

// Write a program that asks for an amount of seconds and prints how many days, hours, minutes and seconds correspond to this magnitude.
// For example:
// 532720
// In 532720 we 