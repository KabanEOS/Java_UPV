// package com.madejski;
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int num;
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                sum -= 1.0/ i;
            }
            else{
                sum += 1.0/ i;
            }
        }
        System.out.println(sum);
    }
}

