package com.madejski;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        num1 = scanner.nextInt();

        System.out.print("Num2: ");
        num2 = scanner.nextInt();

        sum = num1 + num2;
        System.out.println(sum);
    }
}
