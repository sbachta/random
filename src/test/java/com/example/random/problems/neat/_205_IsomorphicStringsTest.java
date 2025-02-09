package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _205_IsomorphicStringsTest {

    private final _205_IsomorphicStrings subject = new _205_IsomorphicStrings();

    @Test
    void exampleOne() {
        assertTrue(subject.isIsomorphic("egg", "add"));
    }

    @Test
    void exampleTwo() {
        assertFalse(subject.isIsomorphic("foo", "bar"));
    }

    @Test
    void exampleThree() {
        assertTrue(subject.isIsomorphic("paper", "title"));
    }
}