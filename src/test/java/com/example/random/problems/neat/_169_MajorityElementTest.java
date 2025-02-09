package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _169_MajorityElementTest {

    public _169_MajorityElement subject = new _169_MajorityElement();

    @Test
    void exampleOne() {
        assertThat(subject.majorityElement(new int[]{3,2,3})).isEqualTo(3);
    }

    @Test
    void exampleTwo() {
        assertThat(subject.majorityElement(new int[]{2,2,1,1,2,1,1})).isEqualTo(1);
    }

    @Test
    void exampleThree() {
        assertThat(subject.majorityElement(new int[]{2,1,1,1,2,1,3,1})).isEqualTo(1);
    }
}