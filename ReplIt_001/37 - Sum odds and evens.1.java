// package com.madejski;
import java.util.Scanner;
import java.io.*;

 class Main {
     public static void main(String[] args) {
         int even_cnt = 0;
         int odd_cnt = 0;
         int even = 0;
         int odd = 0;
         Scanner scan=new Scanner(System.in);
             System.out.println("How many numbers do you want to introduce? ");
             int num = scan.nextInt();
             for (int i = 1; i <= num; ++i) {
                 if (i % 2 == 0) {
                     even += i;
                 } else if (i % 2 == 1) {
                     odd += i;
                 }
             }
             System.out.println("Sum of even nums inside your num: " + even);
             System.out.println("Sum of odd nums inside your num: " + odd);
     }
 }
 
//        num 10
//        even-> 2,4,6,8,10 //5 //sum = 30
//        odd->  1,3,5,7,9  //5 //sum = 25

