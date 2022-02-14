// https://codingbat.com/prob/p105136

public class Main {
    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[] {2, 4, 8},  10)); // true
        System.out.println(groupSumClump(0, new int[] {1, 2, 4, 8, 1},  14)); // true
        System.out.println(groupSumClump(0, new int[] {2, 4, 4, 8},  14)); // false
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target, with this additional
     * constraint: if there are numbers in the array that are adjacent and the
     * identical value, they must either all be chosen, or none of them chosen.
     * For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
     * the middle must be chosen or not, all as a group. (one loop can be used
     * to find the extent of the identical values).
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        
    }
}
