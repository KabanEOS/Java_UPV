package com.madejski;
import java.util.Scanner;
import java.io.*;

 class Main {
     public static void main(String[] args) {
         String str;
         char ch;
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter a string : ");
         str=scan.nextLine();
         System.out.print("Reversed string : ");
         for(int i=str.length();i>0;--i)
         {
             System.out.print(str.charAt(i-1));
         }

     }
 }

