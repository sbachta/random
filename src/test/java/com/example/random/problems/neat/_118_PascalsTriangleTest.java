package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _118_PascalsTriangleTest {

    _118_PascalsTriangle subject = new _118_PascalsTriangle();

    @Test
    void example1() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
        );
        List<List<Integer>> actual = subject.generate(5);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void example2() {
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        List<List<Integer>> actual = subject.generate(1);

        assertThat(expected).isEqualTo(actual);
    }
}