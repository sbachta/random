package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _217_ContainsDuplicateTest {

    private final _217_ContainsDuplicate subject = new _217_ContainsDuplicate();

    @Test
    void shouldReturnTrueWhenInputShowsUpTwice() {
        int[] input = {1, 1};

        boolean actual = subject.containsDuplicate(input);

        assertThat(actual).isTrue();
    }

    @Test
    void shouldReturnFalseWhenInputDoesNotHaveDups() {
        int[] input = {1, 2};

        boolean actual = subject.containsDuplicate(input);

        assertThat(actual).isFalse();
    }
}