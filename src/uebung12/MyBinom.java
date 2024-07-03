package uebung12;

//-----------------------------------------------------------------//
public class MyBinom {
    //---------------------------------------------------------------//
    public static int binom(int n, int k) {
        // TODO: implement
        int[][] binomial = new int[n+1][k+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if(j == 0 || j == i) {
                    binomial[i][j] = 1;
                } else {
                    binomial[i][j] = binomial[i-1][j-1] + binomial[i-1][j];
                }
            }
        }
        return binomial[n][k];
    }

    public static int binom_recursive(int n, int k) {

        int[][] binomial = new int[n+1][k+1];

        if (k == 0 || k == n) {
            return 1;
        } else {
            return binom_recursive(n-1, k-1) + binom_recursive(n-1, k);
        }
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: insert test case with visualized output

        for (int n = 0; n <= 10; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(binom(n, k) + " ");
            }
            System.out.println();
        }

        System.out.println(binom_recursive(5, 2));

        long startIterative = System.currentTimeMillis();
        System.out.println(binom(30, 20));
        long endIterative = System.currentTimeMillis();

        long startRecursive = System.currentTimeMillis();
        System.out.println(binom_recursive(30, 20));
        long endRecursive = System.currentTimeMillis();

        System.out.println("Iterative: " + (endIterative - startIterative) + "ms");
        System.out.println("Recursive: " + (endRecursive - startRecursive) + "ms");



    }
}
