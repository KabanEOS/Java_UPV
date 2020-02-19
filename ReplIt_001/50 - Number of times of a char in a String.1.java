package com.madejski;

class Main {

    public static int numberOfACharIterative(String s, char c) {
        int counter=0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==c) counter++;
        }
        return counter;
    }

    public static int numberOfACharRecursive(String s, char c, int counter) {
        if (counter >= s.length()) return 0;
        int count = s.charAt(counter)==c ? 1 : 0;
        return count + numberOfACharRecursive(s, c, counter+1);
    }

    public static void main(String[] args) {
        // Check out here how they work... for example
         System.out.println(numberOfACharIterative("Hola amic amable", 'a'));
         System.out.println(numberOfACharRecursive("Hola amic amable", 'a', 0));  // Look out the extra parameter
    }
}