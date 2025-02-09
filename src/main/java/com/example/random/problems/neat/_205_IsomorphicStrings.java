package com.example.random.problems.neat;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * Constraints:
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */

public class _205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> firstMap = new HashMap<>();
        HashMap<Character, Character> secondMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char firstChar = s.charAt(i);
            char secondChar = t.charAt(i);

            if((firstMap.containsKey(firstChar) && !firstMap.get(firstChar).equals(secondChar)) ||
               (secondMap.containsKey(secondChar) && !secondMap.get(secondChar).equals(firstChar))) {
                return false;
            }

            firstMap.put(firstChar, secondChar);
            secondMap.put(secondChar, firstChar);
        }
        return true;
    }
}
