package com.example.random.problems.neat;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 */

public class _169_MajorityElement {

    public int majorityElement(int[] nums) {

        int result = 0;
        int count = 0;

        for(int number: nums) {
            if(count == 0)
                result = number;
            count += (number == result ? 1: -1);
        }

        return result;

    }
}
