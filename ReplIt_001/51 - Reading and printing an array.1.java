  import java.util.Scanner;

class Main {
  
  // Reading an array from keyboard - FIRST VERSION
  public static int[] readArray() {
    Scanner input = new Scanner(System.in);
    int n; // Number of components
    
    System.out.println("How many integers are you going to give me?");
    n = input.nextInt();
    
    int[] v = new int[n];
    System.out.println("Give me " + n + " integers:");
    for (int i = 0; i < v.length; i++)
      v[i] = input.nextInt();
    
    return v;
  }
  
  // Reading an array from keyboard - SECOND VERSION
  public static void readArray(int[] v) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Give me " + v.length + " integers:");
    for (int i = 0; i < v.length; i++)a
      v[i] = input.nextInt();
  }
  
  // As you can see, we have two methods called 'readArray',
  // when we do that we say that the method is overloaded.
  // 1. Can you explain me briefly when this overloading method possibility
  // can be done and the advantages?
  // Your answer:
  // You can use the same function in different cases, with different types of variables, 
  //
  //
  // 2. The two methods do the same task but in different ways. The first 
  // creates and returns the array; the second implies that you first create
  // the array and use it as a parameter in order to be filled.
  // What is exactly returning the first method? a reference or an array?
  // Your answer:
  //
  //
  // If Java parameter passing is only by value, how is it possible that the
  // second method works and really modifies the array we are sending?
  // Your answer:
  //
  //
  
  // Printing an array 
  static public void printArray(int[] v) {
    System.out.println("The components of the array are:");
    for (int i = 0; i < v.length; i++)
      System.out.println(v[i]);
  }
  // 3. What is 'v'? How much memory does it uses? What receives as copy?
  // Your answer:
  //
  //
  
  public static void main(String[] args) {
    // Testing the two methods
    
    // First method
    System.out.println("Testing the first method");
    int [] v1 = readArray(); // <---- Calling to the first method
    printArray(v1);
    
    // Second method
    System.out.println("Testing the second method");
    Scanner input = new Scanner(System.in);
    int n; // Number of components
    
    System.out.println("How many integers are you going to give me?");
    n = input.nextInt();
    int [] v2 = new int[n];
    readArray(v2);  // <---- Calling to the second method
    printArray(v2);
  }
}