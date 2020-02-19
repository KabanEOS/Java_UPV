package com.madejski;
import java.util.Scanner;
import java.io.*;

 class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("How big your pyramide have to be?: (1-10) ");
         int rows = scan.nextInt();
         int j=0;
         for (int i = 1; i <= rows; ++i, j = 0) {
             for (int space = 1; space <= rows - i; ++space) {
                 System.out.print(" ");
             }
             while (j != 2 * i - 1) {
                 System.out.print("*");
                 ++j;
             }
             System.out.println();
         }
     }
 }

