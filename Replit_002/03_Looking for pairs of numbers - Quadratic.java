class Main {
  
  // Looking for the first repeated number
  public static int firstRepeated(int[] v) {
    // Your code here
  }
  
  // Question 1.
  // How many nested loops has your solution?
  // Answer:
  //
  
  // Question 2.
  // If the input array has 10 elements and there is no repeated number,
  // how many times the instruction/s inside the inner loop is/are executed?
  // Answer:
  //
  
  
  
  public static void main(String[] args) {
    
    // Let's try our code
    int[] v1 = {9, 5, 4, 7, 6, 5, 3, 4, 8, 9, 1, 3}; // The solution is 5
    int[] v2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // No solution (-1)
    
    System.out.println(firstRepeated(v1)); // Answer must be 5
    System.out.println(firstRepeated(v2)); // Answer must be -1
  }
}