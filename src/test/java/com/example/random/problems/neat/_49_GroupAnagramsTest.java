package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class _49_GroupAnagramsTest {

    private final _49_GroupAnagrams subject = new _49_GroupAnagrams();

    @Test
    void simpleProblem() {
        String[]           input  = new String[]{"act","hat"};
        List<List<String>> expected = List.of(
                List.of("hat"),
                List.of("act")
        );

        List<List<String>> actual = subject.groupAnagrams(input);

        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }

    @Test
    void example1() {
        String[]           input  = new String[]{"act","pots","tops","cat","stop","hat"};
        List<List<String>> expected = List.of(
                List.of("hat"),
                List.of("act", "cat"),
                List.of("pots", "tops", "stop")
        );

        List<List<String>> actual = subject.groupAnagrams(input);

        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }

    @Test
    void example2() {
        String[]           input  = new String[]{"x"};
        List<List<String>> expected = List.of(
                List.of("x")
        );

        List<List<String>> actual = subject.groupAnagrams(input);

        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }

    @Test
    void example3() {
        String[]           input  = new String[]{""};
        List<List<String>> expected = List.of(
                List.of("")
        );

        List<List<String>> actual = subject.groupAnagrams(input);

        assertThat(expected).containsExactlyInAnyOrderElementsOf(actual);
    }
}