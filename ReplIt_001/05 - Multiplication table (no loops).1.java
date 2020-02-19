package com.madejski;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Multiplipcation table of which number you want to see? (1-9)");
        int num = scanner.nextInt();
        for(int m=0; m<9; m++){
            System.out.println(num +" x "+ m + " = " + (num*m));
        }

    }
}

// Write a program that ask for an integer from 1 to 9 and writes the multiplication table of this number (each value in each line).
// Things to have into account:
// If you know how to use loops, this is not asked here. So, no loops.
// We would like a similar output like this:
// 4 x 1 = 4
// 4 x 2 = 8
// 4 x 3 = 12
// .... and so on...
// Remember that printing something we can use the operator + as a way for concatenating. For example:
// System.println(i + " x " + 3 + " = " + i *3);  // Being i a integer variable
// It is not necessary to check out if the user is writing a number between 1 and 9... let's thinkg the user is not going to introduce something different