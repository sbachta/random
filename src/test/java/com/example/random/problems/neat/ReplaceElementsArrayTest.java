package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReplaceElementsArrayTest {
    
    private final ReplaceElementsArray subject = new ReplaceElementsArray();

    @Test
    void shouldReturnNegativeOneIfNoOtherElements() {
        int[] input = {1};

        int[] actual = subject.replaceElements(input);

        assertThat(actual).isEqualTo(new int[]{-1});
    }

    @Test
    void shouldReplaceWithGreatestElementToRight() {
        int[] input = {1, 2};

        int[] actual = subject.replaceElements(input);

        assertThat(actual).isEqualTo(new int[]{2, -1});
    }

    @Test
    void shouldReplaceWithGreatestElementToRightAgain() {
        int[] input = {17,18,5,4,6,1};

        int[] actual = subject.replaceElements(input);

        assertThat(actual).isEqualTo(new int[]{18,6,6,6,1,-1});
    }
}