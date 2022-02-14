// https://codingbat.com/prob/p199368

public class Main {
    public static void main(String[] args) {
        System.out.println(groupSum6(0, new int[] {5, 6, 2},  8)); // true
        System.out.println(groupSum6(0, new int[] {5, 6, 2},  9)); // false
        System.out.println(groupSum6(0, new int[] {5, 6, 2},  7)); // false
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, beginning at the start index, such that the group sums to the given
     * target? However, with the additional constraint that all 6's must be
     * chosen. (No loops needed.)
     */
    public static boolean groupSum6(int start, int[] nums, int target) {
        
    }
}
