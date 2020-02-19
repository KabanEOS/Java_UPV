package com.madejski;
import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the string: ");
        String str = scan.nextLine();
        System.out.println("Write the character to check: ");
        char c = scan.next().charAt(0);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == c && str.length()>0) {
                System.out.println("Your string CONTAINS entered character on the " + i + " position");
                return;
                };
            }
        System.out.println("Your string DOES NOT CONTAINS entered character");
    }
}

////////////////////

package com.madejski;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i= 0;
        System.out.println("Write the string: ");
        String str = scan.nextLine();
        System.out.println("Write the character to check: ");
        char c = scan.next().charAt(0);
        boolean result = false;
        while(i < str.length() && !result) {
                if (str.charAt(i) == c && str.length() != 0) {
                    System.out.println("Your string CONTAINS entered character on the " + i + " position");
                    result = true;
                }else i++;
        }
        if (i == str.length() && !result){
            System.out.println("Your string doesn't CONTAINS entered character");
        }
    }
}



