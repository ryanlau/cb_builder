// https://codingbat.com/prob/p136594

public class Main {
    public static void main(String[] args) {
        xyzThere("abcxyz"); // true
        xyzThere("abc.xyz"); // false
        xyzThere("xyz.abc"); // true
    }

    /*
     * Return true if the given string contains an appearance of "xyz" where the
     * xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     */
    public static boolean xyzThere(String str) {

    }
}
