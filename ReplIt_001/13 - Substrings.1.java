package com.madejski;
import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write first string: ");
        String str1 = scan.nextLine();

        System.out.println("Write second string: ");
        String str2 = scan.nextLine();

        System.out.println(str1.equals(str2));
    }
}
//Write a program that asks for two strings and answers if the content of the two strings is the same.