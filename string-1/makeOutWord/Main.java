// https://codingbat.com/prob/p184030

public class Main {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay")); // "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); // "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // "[[word]]"
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new
     * string where the word is in the middle of the out string, e.g.
     * "<<word>>". Note: use str.substring(i, j) to extract the String starting
     * at index i and going up to but not including index j.
     */
    public static String makeOutWord(String out, String word) {
        
    }
}
