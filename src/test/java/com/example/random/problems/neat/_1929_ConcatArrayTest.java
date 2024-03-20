package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1929_ConcatArrayTest {
    
    private final _1929_ConcatArray subject = new _1929_ConcatArray();

    @Test
    void shouldReturnIntArrayThatIsConcatOfInput() {
        int[] input = {1};
        int[] expected = {1,1};

        int[] actual = subject.getConcatenation(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnIntArrayThatIsConcatOfInputAgain() {
        int[] input = {1,4,5,2};
        int[] expected = {1,4,5,2,1,4,5,2};

        int[] actual = subject.getConcatenation(input);

        assertThat(actual).isEqualTo(expected);
    }
}