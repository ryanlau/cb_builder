// https://codingbat.com/prob/p134250

public class Main {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby")); // true
        System.out.println(xyBalance("aaxbb")); // false
        System.out.println(xyBalance("yaaxbb")); // false
    }

    /*
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy"
     * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
     * true if the given string is xy-balanced.
     */
    public static boolean xyBalance(String str) {
        
    }
}
