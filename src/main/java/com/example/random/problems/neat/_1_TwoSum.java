package com.example.random.problems.neat;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 *
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 *
 * Return the answer with the smaller index first.
 *
 * Example 1:
 *
 * Input:
 * nums = [3,4,5,6], target = 7
 *
 * Output: [0,1]
 * Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
 * Example 2:
 *
 * Input: nums = [4,5,6], target = 10
 *
 * Output: [0,2]
 * Example 3:
 *
 * Input: nums = [5,5], target = 10
 *
 * Output: [0,1]
 * Constraints:
 *
 * 2 <= nums.length <= 1000
 * -10,000,000 <= nums[i] <= 10,000,000
 * -10,000,000 <= target <= 10,000,000
 */

public class _1_TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> previousNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int difference = target - currentNumber;

            if (previousNumbers.containsKey(difference)) {
                return new int[] {previousNumbers.get(difference), i};
            }
            previousNumbers.put(currentNumber, i);
        }
        return new int[] {};
    }
}
