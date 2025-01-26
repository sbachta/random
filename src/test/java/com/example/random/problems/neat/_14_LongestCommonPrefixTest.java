package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _14_LongestCommonPrefixTest {

    private final _14_LongestCommonPrefix subject = new _14_LongestCommonPrefix();

    @Test
    void shouldReturnEmptyStringForNoMatch() {
        final String[] input = {"dog","racecar","car"};

        String         actual     = subject.longestCommonPrefix(input);

        assertEquals("", actual);
    }

    @Test
    void shouldReturnFLStringForInput() {
        final String[] input = {"flower","flow","flight"};

        String         actual     = subject.longestCommonPrefix(input);

        assertEquals("fl", actual);
    }

    @Test
    void shouldReturnAppStringForInput() {
        final String[] input = {"apple","application","app"};

        String         actual     = subject.longestCommonPrefix(input);

        assertEquals("app", actual);
    }
}