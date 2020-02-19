// package com.madejski;

class Main {

    public static int findCharacter(String s, char c, int position) {
        if(s.charAt(position)==c) return position;
            // trap part, catches character and like good dog during chase commincate with barking, wow, wow position...
        else if(position == s.length()-1) return -1;
            // sad dog, haven't found anything
        else return findCharacter(s,c, position +1);
            // dogo is persistent, dogo run, dogo iterate
    }

    public static void main(String[] args) {
        System.out.println(findCharacter("Hello world !", '!', 0));
        System.out.println(findCharacter("Hello world !", 'q', 0));
    }
}