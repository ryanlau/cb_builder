// https://codingbat.com/prob/p110222

public class Main {
    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[] {1, 2, 1, 3},  1)); // true
        System.out.println(isEverywhere(new int[] {1, 2, 1, 3},  2)); // false
        System.out.println(isEverywhere(new int[] {1, 2, 1, 3, 4},  1)); // false
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of
     * adjacent elements in the array, at least one of the pair is that value.
     * Return true if the given value is everywhere in the array.
     */
    public static boolean isEverywhere(int[] nums, int val) {
        
    }
}
