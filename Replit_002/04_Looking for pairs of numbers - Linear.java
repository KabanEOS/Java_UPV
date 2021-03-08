package replit;

class Main {

    // Looking for the first repeated number
    public static int firstRepeated(int[] v) {
        boolean found = false;
        int[]r = new int[10];
        int number= 0;

        for(int i = 0; i < v.length && !found; i++){
            r[v[i]]++;
            number++;
            if(r[v[i]]==2) return v[i];
        }
        // 9 5 4 7 6 5 3 8 9 1 3
        // 0 1 0 0 0 1 0 0 1 0 0
        //           1
        System.out.println("Number that appears repeated in first place: " + number);
        return -1;
    }

    // Question 1.
    // How many nested loops has your solution?
    // Answer:
    //

    // Question 2.
    // If the input array has 10 elements and there is no repeated number,
    // how many times the instruction/s inside the inner loop is executed?
    // Answer:
    //

    // Question 3.
    // What is the difference in number of instructions executed of this
    // approach compared to the first approach when a pair is not found.
    // Answer:
    //

    // Question 4.
    // Are both correct/effective?
    // Answer:
    //

    // Question 5.
    // Are both efficient?
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