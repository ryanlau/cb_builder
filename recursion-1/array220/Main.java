// https://codingbat.com/prob/p173469

public class Main {
    public static void main(String[] args) {
        System.out.println(array220(new int[] {1, 2, 20},  0)); // true
        System.out.println(array220(new int[] {3, 30},  0)); // true
        System.out.println(array220(new int[] {3},  0)); // false
    }

    /**
     * Given an array of ints, compute recursively if the array contains
     * somewhere a value followed in the array by that value times 10. We'll use
     * the convention of considering only the part of the array that begins at
     * the given index. In this way, a recursive call can pass index+1 to move
     * down the array. The initial call will pass in index as 0.
     */
    public static boolean array220(int[] nums, int index) {
        
    }
}
