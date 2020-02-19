package com.madejski;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{

    public static void main(String[] args)
    {
        float num1, num2;
        char op;

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me the first operand: ");
        num1 = scan.nextFloat();

        System.out.println("Give me the second operand: ");
        num2 = scan.nextFloat();

        System.out.println("Give me the operation (+, -, *, /) : ");
        Scanner reader = new Scanner(System.in);
        op = reader.next().charAt(0);

        if (op == '+')
        {
            System.out.println("The result is: " + (num1 + num2));
        }
        if  (op == '-')
        {
            System.out.println("The result is: " + (num1 - num2));
        }
        if (op == '/')
        {
            System.out.println("The result is: " + (num1 / num2));
        }
        if (op == '*')
        {
            System.out.println("The result is: " + (num1 * num2));
        }


    }
}

// Writing a simple calculator

// Write a program that asks for:
// A first real number
// A second real number
// An operator (+, -, *, /) . --> We can use 'char' type to ask for the operator

// The program has to carry out the operation and print the result.

// For example:
// Give me the first operand:
// 5.5
// Give me the second operand:
// 2
// Give me the operation:
// /
// The result is: 2.75


// ========================

// Better with a switch statement, like....

// switch (op) {
//     case '+': ......
//     case '-': ......

// and so on....