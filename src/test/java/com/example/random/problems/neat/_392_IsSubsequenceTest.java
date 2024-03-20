package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _392_IsSubsequenceTest {

    private final _392_IsSubsequence subject = new _392_IsSubsequence();

    @Test
    void returnTrueWhenInputStringCanBeFound() {
        final String first = "ab";
        final String second = "ayb";

        boolean actual = subject.isSubsequence(first, second);

        assertThat(actual).isTrue();
    }

    @Test
    void returnTrueWhenInputStringCanBeFoundAgain() {
        final String first = "abc";
        final String second = "ahbgdc";

        boolean actual = subject.isSubsequence(first, second);

        assertThat(actual).isTrue();
    }

    @Test
    void returnFalseWhenInputStringCanNotBeFoundAgain() {
        final String first = "axc";
        final String second = "ahbgdc";

        boolean actual = subject.isSubsequence(first, second);

        assertThat(actual).isFalse();
    }
}