// https://codingbat.com/prob/p154048

public class Main {
    public static void main(String[] args) {
        System.out.println(countPairs("axa")); // 1
        System.out.println(countPairs("axax")); // 2
        System.out.println(countPairs("axbx")); // 1
    }

    /**
     * We'll say that a "pair" in a string is two instances of a char separated
     * by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA"
     * contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number
     * of pairs in the given string.
     */
    public static int countPairs(String str) {
        
    }
}
