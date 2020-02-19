// LOOP METHOD

package com.madejski;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=0;
        int min = 0;
        int max = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to introduce?");
        n = scan.nextInt();
        System.out.println("Introduce " + n + "numbers.");

        for (int i = 1; i<=n; i++){
            System.out.print("Num " + i + ": ");
            int current = scan.nextInt();

            if(current > max){
                max = current;
            }
            else(current < min){
                min = current;
            }
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
}

// ARRAY METHOD

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

 class Main {
     public static void main(String[] args) {

         int num = 0;

         Scanner scan = new Scanner(System.in);
         System.out.println("How many numbers do you want to introduce? :");
         num = scan.nextInt();
         System.out.println("Ok, enter " + num + " values.");
         int[] arr = new int[num];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = scan.nextInt();
         }

         int min = Arrays.stream(arr).min().getAsInt();
         int max = Arrays.stream(arr).max().getAsInt();

         System.out.println("Max number: " + max);
         System.out.println("Min number: " + min);
     }
 }
 
 //that was anything about method so I've choosen fastest to implement one 