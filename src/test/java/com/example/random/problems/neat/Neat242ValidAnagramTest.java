package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Neat242ValidAnagramTest {
    
    final _242_ValidAnagram subject = new _242_ValidAnagram();

    @Test
    void shouldReturnFalseWhenInputIsNotValidAnagram() {
        final String inputOne = "t";
        final String inputTwo = "e";

        final boolean actual = subject.isAnagram(inputOne, inputTwo);

        assertThat(actual).isFalse();
    }

    @Test
    void shouldReturnTrueWhenInputIsValidAnagram() {
        final String inputOne = "top";
        final String inputTwo = "pot";

        final boolean actual = subject.isAnagram(inputOne, inputTwo);

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalseWhenOneInputsEmpty() {
        final String inputOne = "t";

        final boolean actual = subject.isAnagram(inputOne, null);

        assertThat(actual).isFalse();
    }
}