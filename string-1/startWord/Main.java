// https://codingbat.com/prob/p141494

public class Main {
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi")); // "hi"
        System.out.println(startWord("hippo", "xip")); // "hip"
        System.out.println(startWord("hippo", "i")); // "h"
    }

    /*
     * Given a string and a second "word" string, we'll say that the word
     * matches the string if it appears at the front of the string, except its
     * first char does not need to match exactly. On a match, return the front
     * of the string, or otherwise return the empty string. So, so with the
     * string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The
     * word will be at least length 1.
     */
    public static String startWord(String str, String word) {
        
    }
}
