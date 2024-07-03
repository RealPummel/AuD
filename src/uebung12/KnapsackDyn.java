package uebung12;

//-----------------------------------------------------------------//
public class KnapsackDyn {

    public static int knapsack(int[] value, int[] weight, int c) {

        int n = value.length;
        int[][] table = new int[n+1][c+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= c; j++) {
                if(i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if(weight[i-1] <= j) {
                    table[i][j] = Math.max(value[i-1] + table[i-1][j -weight[i-1]], table[i-1][j]);
                } else {
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[n][c];
    }


    public static void main(String[] args) {
        // TODO: implement your solution

        int[] value = {3, 5, 8, 9};
        int[] weight = {3, 4, 6, 7};
        int c = 15;

        System.out.println(knapsack(value, weight, c));
    }
}
