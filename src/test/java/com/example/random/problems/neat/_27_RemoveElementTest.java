package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class _27_RemoveElementTest {
    
    private final _27_RemoveElement subject = new _27_RemoveElement();

    @Test
    void exampleOne() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        int actual = subject.removeElement(nums, val);

        assertThat(actual).isEqualTo(2);
        assertThat(nums).isEqualTo(new int[]{2,2, MAX_VALUE, MAX_VALUE});
    }

    @Test
    void exampleTwo() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;

        int actual = subject.removeElement(nums, val);

        assertThat(actual).isEqualTo(5);
        assertThat(nums).isEqualTo(new int[]{0,0,1,3,4, MAX_VALUE, MAX_VALUE, MAX_VALUE});
    }
}