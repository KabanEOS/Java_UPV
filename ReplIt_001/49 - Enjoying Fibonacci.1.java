// package com.madejski;


class Main {

    // Fibonacci recursive version
    // 10 fibonacci num is 55 not 89
    // I have corrected the code
    // http://personal.ee.surrey.ac.uk/Personal/R.Knott/Fibonacci/fibtable.html
    // https://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego
    public static long fibR(long f) {
        if (f <=1) return f;
        else return fibR(f-1) + fibR(f-2);
    }

//     Fibonacci iterative version
     public static long fibI(long f) {
         long first=0,second=1,nth=1;
         if (f<=2) return 1;
         else{
             for(long i = 2; i<=f; i++){
//             for(long i = 2; i<=f; i++){
//             -> to have same number as in fibR we
//             need to start from 2 but I don't think it's correct
                 nth=first+second;
                 first=second;
                 second=nth;
             }
         }
         return nth;
     }

    public static void main(String[] args) {
        // System.out.println("Fibonacci I of 10 is " + fibI(10));
        System.out.println("Fibonacci R of 10 is " + fibR(10000));
//        System.out.println("Fibonacci of 50 is " + fibR(50));
//        System.out.println("Fibonacci of 10000 is " + fibR(10000));
    }
}

// 1. What is the result of fibR(10)? How long it takes approx?
// Answer here:
// 89. Ans. was immediate.

// 2. What is the result of fibR(50)? How long it takes approx?
// Answer here:
// It took around 80sec. It was so long i thought my computer crashed,
// and I'm such an impatient person that I thought the restart is necessary so... total final time was around 3 min

// 3. What happens when calculating fibR(10000)? (Look at the first message of your console in repl.it)
// What do you think the problem is?
// Answer here:
// https://www.bigprimes.net/archive/fibonacci/10000/
// StackOverflow (Error) is literally the answer. Memory wanted to store 10000 longs is too big. 
// 
// 
// https://www.youtube.com/watch?v=lHytjEj7B9g
//
// 4. Write a iterative version of Fibonacci (fibI) -> in the problem text you have some help...

// 5. Try fibI(50).... any difference? (the result has to be the same)
//
// No, result can't be the same, it should be one item "before"

// 6. Is it fibI(10000) working? Why? What is the problem now?
// It's counting number quickly but variable is too small and just get crazy. In incomprehensible way it's giving -num.

// 7. (For very advanced students;) If you have detected the right problem in 6, why don't you try to use
// double instead of long for every data? What happens then? If we have again problems... then we kill ourselves?
// In this particular case it's giving infinity when I use double. Thought double take more place in memory than float.
// But we don't need  floating point num, so its even more unusable in this case. 