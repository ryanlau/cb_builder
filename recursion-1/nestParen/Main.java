// https://codingbat.com/prob/p183174

public class Main {
    public static void main(String[] args) {
        System.out.println(nestParen("(())")); // true
        System.out.println(nestParen("((()))")); // true
        System.out.println(nestParen("(((x))")); // false
    }

    /**
     * Given a string, return true if it is a nesting of zero or more pairs of
     * parenthesis, like "(())" or "((()))". Suggestion: check the first and
     * last chars, and then recur on what's inside them.
     */
    public static boolean nestParen(String str) {
        
    }
}
