// https://codingbat.com/prob/p169506

public class Main {
    public static void main(String[] args) {
        System.out.println(notAlone(new int[] {1, 2, 3})); // [1, 3, 3]
        System.out.println(notAlone(new int[] {1, 2, 3, 2, 5, 2})); // [1, 3, 3, 5, 5, 2]
        System.out.println(notAlone(new int[] {3, 4})); // [3, 4]
    }

    /**
     * We'll say that an element in an array is "alone" if there are values
     * before and after it, and those values are different from it. Return a
     * version of the given array where every instance of the given value which
     * is alone is replaced by whichever value to its left or right is larger.
     */
    public static int[] notAlone(int[] nums, int val) {
        
    }
}
