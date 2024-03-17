package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {
    
    final ValidAnagram subject = new ValidAnagram();

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