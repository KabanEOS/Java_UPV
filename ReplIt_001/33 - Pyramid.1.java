package com.madejski;
import java.util.Scanner;
import java.io.*;

 class Main {
         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             System.out.print("How big your pyramide have to be?: (1-10) ");
             int rows = scan.nextInt();

             if(rows<=10 && rows>0 ) {
                 for (int i = 1; i <= rows; ++i) {
                     for (int j = 1; j <= i; ++j) {
                         System.out.print("* ");
                     }
                     System.out.println();
                 }
             }else System.out.println("Give a number between 1 and 10.");
     }
 }

