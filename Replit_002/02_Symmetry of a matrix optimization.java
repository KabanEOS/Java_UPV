public class Main {


public static boolean symmetricI(int[][] m) {
    int n = m.length;
    boolean isSymmetric = true;

    int countI = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (m[i][j] != m[j][i])
            {
                isSymmetric = false;
            }
            countI+=1;

        }
    }
    System.out.println("Needed: " + countI + " iterations");
    return isSymmetric;
}

//   return isSymmetric;
// }

// Questions:
// Why is the previous implementation inefficient?
// Answer:
// Cause its unnecesairly search throught all rows and cols, it's checking kind of booth sides of array when only one half is enough to tell
//

// Is it checking several times the same elements?
// Answer:
// Exactamente!

// Is it necessary even to check out the main diagonal?
// Answer:
// Obviously, NOT

// Try to provide a really efficient implementation of symmetric

public static boolean symmetricE(int[][] m) {
    int n = m.length;
    boolean isSymmetric = true;

    int countE = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (m[i][j] != m[j][i])
            {
                isSymmetric = false;
            }
            countE+=1;
        }
    }
    System.out.println("Needed: " + countE + " iterations");
    return isSymmetric;
}

public static void main(String[] args) {

    // Let's test our algorithm
    int[][] m = {{1, 2, 3, 3},
                {2, 1, 2, 2},
                {3, 2, 1, 1},
                {3, 2, 1, 1}};


    if (symmetricI(m)) System.out.println("Inefficient method says The matrix is symmetric ");
    else System.out.println("The matrix is not symmetric");

    if (symmetricE(m)) System.out.println("Efficient method says The matrix is symmetric");
    else System.out.println("The matrix is not symmetric");
    // dont know how to delet tab for many :d
}
}
