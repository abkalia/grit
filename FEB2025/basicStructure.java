package FEB2025;

import java.util.Arrays;

public class basicStructure {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,1,2,3};
        // issue here is the array is sorted but its rotated.
        //let try to sort this array by using a binary sort function which checks for the condition A[p]>A[p+1]
        System.err.println(Arrays.binarySearch(nums, 2));
        System.err.println(7/2);
        System.err.println(1/2);
    }

    public static int binarySort(Integer[] nums) {
        int length = nums.length;
        int mid = length/2;
        return 5;
    }
}