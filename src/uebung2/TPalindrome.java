package uebung2;

import aud.Stack;

public class TPalindrome {

    public static int recisTPalindrome(String text, int i) {
        Stack<Character> tempstack = new Stack<>();

        int j = i;

        do {
            j++;
            if (text.charAt(j) == '(') {
                j = recisTPalindrome(text, j);
            }
            if (Character.isLetter(text.charAt(j))) {
                tempstack.push(Character.toLowerCase(text.charAt(j)));
            }
        } while (text.charAt(j) != ')');

        int k = i + 1;
        do {
            if (text.charAt(k) == '(') {
                k = j;
            } else if (Character.isLetter(text.charAt(k))) {
                if (tempstack.is_empty() || tempstack.pop() != Character.toLowerCase(text.charAt(k))) {
                    return -1;
                }
            }
            k++;
        } while (k <= j);

        return j;
    }

    public static boolean isTPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                int j = recisTPalindrome(text, i);
                if (j == -1) {
                    return false;
                }
                i = j;
            } else if (Character.isLetter(text.charAt(i))) {
                stack.push(Character.toLowerCase(text.charAt(i)));
            }
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                while (text.charAt(i) != ')') {
                    i++;
                }
            } else if (Character.isLetter(text.charAt(i))) {
                if (stack.is_empty() || stack.pop() != Character.toLowerCase(text.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTPalindrome("abc(otto)(anna)cba"));
        System.out.println(isTPalindrome("abc(ot(tt)to)cba"));
    }
}