package com.madejski;

class Main {

    public static int linearSearch(int[] v, int x) {
        int length = v.length - 1;
        boolean found = true;
        int position = -1;
        while (found) {
            int middle = (int) Math.floor(length / 2);

            for (int i = 0; i <= middle; i++) {
                int j = length - i;

                if (v[i] == x || v[j] == x) {
                    found = false;
                    position = i;
                    position = j;
                    
                }
            }
        }
        return position;
    }

    // Question 1: (answer as a comment)
    // Why is the previous implementation of the linearSearch 'inefficient'?
    // Answer:
    // Cause it searched all the elements without any kind of break mechanism.
    // I implemented also some simple double sided searching logic. 
    //

    public static void main(String[] args) {

        // Let's see an example of the algorithm in action
        int[] v = {5, 6, 2, 9, 0, 10, 34, 3, 25};

        int found = linearSearch(v, 25);

        if (found != -1)
            System.out.println("The element was found at position " + found);
        else
            System.out.println("The element was not found");
    }
}