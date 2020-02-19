package com.madejski;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values: ");
        //asking for numbers
        for(int i=0;i< arr.length; i++){
            arr[i] = scan.nextInt();
        }

        //print
        System.out.println("Result: ");
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}

// what is better in your opinion Sir...? doing sth. with 10 lines of code and learning sth. new, challenging myself more?
// or doing stuff with the same trained already many times path?