package com.madejski;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        float A = scan.nextFloat();
        System.out.print("B: ");
        float B = scan.nextFloat();
        System.out.print("C: ");
        float C = scan.nextFloat();

        if( ((Math.pow(B,2) + Math.pow(C,2)) == Math.pow(A,2)) || ((Math.pow(A,2) + Math.pow(C,2)) == Math.pow(B,2)) ||  ((Math.pow(A,2) + Math.pow(B,2)) == Math.pow(C,2)) ){
            System.out.println("Your triangle is pythagorean");}else{
            System.out.println("Your triangle is NOT pythagorean");
            }
        }
}

