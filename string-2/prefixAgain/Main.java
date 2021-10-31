// https://codingbat.com/prob/p136417

public class Main {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1)); // true
        System.out.println(prefixAgain("abXYabc", 2)); // true
        System.out.println(prefixAgain("abXYabc", 3)); // false
    }

    /**
     * Given a string, consider the prefix string made of the first N chars of
     * the string. Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range
     * 1..str.length().
     */
    public static boolean prefixAgain(String str, int n) {
        
    }
}
