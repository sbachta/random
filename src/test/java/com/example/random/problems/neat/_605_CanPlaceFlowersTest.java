package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _605_CanPlaceFlowersTest {

    private final _605_CanPlaceFlowers subject = new _605_CanPlaceFlowers();

    @Test
    void exampleOne() {
        assertTrue(subject.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    @Test
    void exampleTwo() {
        assertFalse(subject.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    @Test
    void exampleThree() {
        assertFalse(subject.canPlaceFlowers(new int[]{0,1,0,1,0,0}, 2));
    }
}