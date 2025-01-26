package com.example.random.problems.neat;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */

public class _14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i<strs[0].length(); i++) {
            for (String str : strs) {
                if (i== str.length() || str.charAt(i) != strs[0].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(i));
        }

        return result.toString();
    }
}
