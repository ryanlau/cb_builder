// https://codingbat.com/prob/p138907

public class Main {
    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[] {2, 5, 10, 4},  19)); // true
        System.out.println(groupSum5(0, new int[] {2, 5, 10, 4},  17)); // true
        System.out.println(groupSum5(0, new int[] {2, 5, 10, 4},  12)); // false
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target with these additional
     * constraints: all multiples of 5 in the array must be included in the
     * group. If the value immediately following a multiple of 5 is 1, it must
     * not be chosen. (No loops needed.)
     */
    public static boolean groupSum5(int start, int[] nums, int target) {
        
    }
}
