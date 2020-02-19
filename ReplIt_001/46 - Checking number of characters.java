

import java.util.Scanner;

class Main {
  
  public static boolean matches(String s) {
    // Write your code here
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    
    if (matches(s))
      System.out.println("Same number of letters and numbers");
    else
      System.out.println("Not the same number of letters and numbers");
    
  }
}