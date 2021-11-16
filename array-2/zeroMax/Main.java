// https://codingbat.com/prob/p187050

public class Main {
    public static void main(String[] args) {
        System.out.println(zeroMax(new int[] {0, 5, 0, 3})); // [5, 5, 3, 3]
        System.out.println(zeroMax(new int[] {0, 4, 0, 3})); // [3, 4, 3, 3]
        System.out.println(zeroMax(new int[] {0, 1, 0})); // [1, 1, 0]
    }

    /**
     * Return a version of the given array where each zero value in the array is
     * replaced by the largest odd value to the right of the zero in the array.
     * If there is no odd value to the right of the zero, leave the zero as a
     * zero.
     */
    public static int[] zeroMax(int[] nums) {
        
    }
}
