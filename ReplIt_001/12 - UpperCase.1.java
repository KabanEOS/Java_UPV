package com.madejski;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Write your message in lowercase: ");

        String S1 = scan.nextLine();

       String l1 = S1.toUpperCase();
        System.out.println("Your message in uppercase: " + l1 );    
  }
}