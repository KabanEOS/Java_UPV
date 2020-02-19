package com.madejski;
import java.util.Scanner;
import java.io.*;


public class Main {

    public static boolean isSubSequence(String str1,
                                 String str2) {
        int i = 0;
        int j = 0;

        while (i < str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            if (str1.length() ==i) {
                return true;
            }
            j++;
        }
        return false;
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write first string: ");
        String str1 = scan.nextLine();

        System.out.println("Write second string: ");
        String str2 = scan.nextLine();

        boolean result = isSubSequence(str1, str2);
        System.out.println(str2 +" is subsequence of "+ str1);

    }
}
