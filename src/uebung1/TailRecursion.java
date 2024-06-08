package uebung1;

public class TailRecursion {

    public static int pow2(int n) {
        return helppow2(n, 1);
    }

    public static int helppow2(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            return helppow2(n - 1, result * 2);
        }
    }

    public static int sumFactors(int n) {
        return helpsumFactors(n, 0, 1);
    }


    public static int helpsumFactors(int n, int result, int i) {
        if(i > n/2){
            return result;
        }
        if (n%i == 0) {
            return helpsumFactors(n, result + i, i+1);
        } else {
            return helpsumFactors(n, result, i+1);
        }
    }

    public static void main(String[] args) {
        int i = 8;
        System.out.println(pow2(i));
        System.out.println(sumFactors(i));
    }
}