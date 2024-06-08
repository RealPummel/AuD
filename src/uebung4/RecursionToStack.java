package uebung4;

import aud.Stack;

public class RecursionToStack {
    //-----------------------------------------------------------------//
    public static int whatStack(int n) {
        // TODO: implement the function `whatRec` with a stack
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        while (n > 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        while (!stack.is_empty()) {
            sum += stack.pop();
        }

        return sum;
    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        System.out.println(whatStack(606));
    }
}
