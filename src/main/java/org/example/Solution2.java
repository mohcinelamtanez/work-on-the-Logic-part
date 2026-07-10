package org.example;

/**
 * @author USER
 **/
public class Solution2 {

    //  Probleme : two Sum 2

    public static int[] twoSumMethod(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else
                return new int[]{left, right};
        }
        return new int[]{left, right};
    }

}

