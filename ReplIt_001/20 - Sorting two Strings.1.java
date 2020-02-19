package com.madejski;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n = 2;
            String[] sarray=new String[n];

            for(int i=0;i<n;i++) {
                System.out.println("enter the " + (i + 1) + " String :");
                sarray[i] = scan.nextLine();
            }

                        for(int i = 0; i < n-1; ++i) {
                            for (int j = i + 1; j < n; ++j) {
                                if (sarray[i].compareTo(sarray[j]) > 0) {
                                    String temp = sarray[i];
                                    sarray[i] = sarray[j];
                                    sarray[j] = temp;
                                }
                            }
                        }
                System.out.println("\nThe lexicographical order of the strings is: ");
                for(int i = 0; i < n; i++) {
                    System.out.println(sarray[i]);
                }
            }
        }

// Write a program that asks for two Strings and prints them in lexicographic order (alphabetical order).

// For example:
// Jordi Zamora
// Jordi Linares

// Result:
// Jordi Linares
// Jordi Zamora
