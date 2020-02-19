package com.madejski;
import java.util.Scanner;

import sun.applet.AppletResourceLoader;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y, x;
        System.out.println("Give me x coordinate:");
        x = scanner.nextDouble();

        y= (Math.pow(x,5))*(-x)+10;
        System.out.println(y);

    }
}


// Write a program that asks for a value 'x' and returns 'y' following this formula:
// y = x^2(-x)+10