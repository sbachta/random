package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _1_TwoSumTest {
    
    private final _1_TwoSum subject = new _1_TwoSum();

    @Test
    void exampleOne() {
        final int[] nums = {3,4,5,6};
        final int[] expected = {0,1};

        int[] actual = subject.twoSum(nums, 7);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void exampleTwo() {
        final int[] nums = {4,5,6};
        final int[] expected = {0,2};

        int[] actual = subject.twoSum(nums, 10);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void exampleThree() {
        final int[] nums = {5,5};
        final int[] expected = {0,1};

        int[] actual = subject.twoSum(nums, 10);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void exampleFour() {
        final int[] nums = {3,5,5};
        final int[] expected = {1,2};

        int[] actual = subject.twoSum(nums, 10);

        assertThat(actual).isEqualTo(expected);
    }
}