// https://codingbat.com/prob/p147538

public class Main {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); // "c13i"
        System.out.println(wordEnds("XY123XY", "XY")); // "13"
        System.out.println(wordEnds("XY1XY", "XY")); // "11"
    }

    /*
     * Given a string and a non-empty word string, return a string made of each
     * char just before and just after every appearance of the word in the
     * string. Ignore cases where there is no char before or after the word, and
     * a char may be included twice if it is between two words.
     */
    public static String wordEnds(String str, String word) {
        
    }
}
