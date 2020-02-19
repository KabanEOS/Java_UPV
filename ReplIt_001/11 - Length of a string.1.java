package com.madejski;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Write your message to the world: ");

        String S1 = scan.nextLine();

       int l1 = S1.length();
        System.out.println("Your message has " + l1 + " characters.");

  }
}