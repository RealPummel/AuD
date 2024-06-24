package uebung10;

import java.util.*;

//---------------------------------------------------------------//
public class AdjMatrix{
    //-------------------------------------------------------------//
    public  static int inDegree(int k, int[][] m){
        //TODO: implement

        int inDegree = 0;

        for (int i = 0; i < m.length; i++) {
            if(m[i][k] == 1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    //-------------------------------------------------------------//
    public  static int outDegree(int k, int[][] m){
        //TODO: implement

        int outDegree = 0;

        for (int i = 0; i < m.length; i++) {
            if(m[k][i] == 1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    //-------------------------------------------------------------//
    public  static List<Integer> adjacent(int k, int[][] m){
        //TODO: implement

        List<Integer> adjacent = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            if(m[k][i] == 1) {
                adjacent.add(i);
            }
        }
        return adjacent;
    }

    //-------------------------------------------------------------//
    public static boolean hasTriangle(int[][] m) {
        //TODO: implement

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] == 1) {
                    for (int k = 0; k < m.length; k++) {
                        if(m[j][k] == 1 && m[k][i] == 1) {
                            System.out.println("Dreieck bei: " + i + " " + j + " " + k);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //-------------------------------------------------------------//
    public static void main(String args[]) {
        //TODO: test your code

        int[][] m = {
            {0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0}
        };

        System.out.println(inDegree(0, m));
        System.out.println(outDegree(0, m));
        System.out.println(adjacent(0, m));
        System.out.println(hasTriangle(m));

    }
}

/*
Dreieck bei: (2, 1) (1, 3) (3, 2)
 */
