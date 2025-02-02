package com.example.random.problems.neat;

import java.util.*;

/**
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 *
 *  Example 2:
 * Input: strs = ["x"]
 * Output: [["x"]]
 *
 *  Example 3:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Constraints:
 * 1 <= strs.length <= 1000.
 * 0 <= strs[i].length <= 100
 * strs[i] is made up of lowercase English letters.
 */

public class _49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String sortedWord = new String(chars);

            if(!result.containsKey(sortedWord)){
                result.put(sortedWord, new ArrayList<>());
            }

            result.get(sortedWord).add(str);
        }
        return new ArrayList<>(result.values());
    }

}
