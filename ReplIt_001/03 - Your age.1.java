package com.madejski;
import java.util.Scanner;

import sun.applet.AppletResourceLoader;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your variables here
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old are you:");
        age = keyboard.nextInt();

        String com = age >= 18 ? "You are adult! and next year you will be "+(age + 1) : "You are not adult, play your toys";
        System.out.println(com);
    }
}
