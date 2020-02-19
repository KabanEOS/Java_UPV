package com.madejski;
        import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int int1 = scan.nextInt();
        System.out.println("Enter second integer:");
        int int2 = scan.nextInt();

        if(int1 % int2 == 0) {
            System.out.println("First integer is multiple of the second ");
        }else{
            System.out.println("First integer is not multiple of the second");
        }
    }
}