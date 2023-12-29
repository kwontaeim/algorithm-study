package top_interview_questions;

public class Remove_Duplicates_from_Sorted_Array {

    /*

    https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

     */

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int len = removeDuplicates(nums);

        printArray(nums);

    }

    static int removeDuplicates(int[] nums) {

        // implement

        return nums.length;
    }

    static void printArray(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

}
