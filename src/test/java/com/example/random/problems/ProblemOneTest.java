package com.example.random.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ProblemOneTest {

    ProblemOne subject = new ProblemOne();

    @Test
    void shouldReturnMostRecentRequestsFirst() {
        ArrayList<String> request = Stream.of("request1", "request3")
                                          .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> expected = Stream.of("request3", "request1")
                                           .collect(Collectors.toCollection(ArrayList::new));

        List<String> actual = subject.getRecentUnique(request, 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnKNumberOfRequests() {
        ArrayList<String> request = Stream.of("request1", "request3")
                                          .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> expected = Stream.of("request3")
                                           .collect(Collectors.toCollection(ArrayList::new));

        List<String> actual = subject.getRecentUnique(request, 1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxNumberOfUniqueRequestsWhenKIsGreaterThanUniqueRequests() {
        ArrayList<String> request = Stream.of("request3", "request1", "request3")
                                          .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> expected = Stream.of("request3", "request1")
                                           .collect(Collectors.toCollection(ArrayList::new));

        List<String> actual = subject.getRecentUnique(request, 5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyListOnNegativeK() {
        ArrayList<String> request = Stream.of("request3", "request1", "request3")
                                          .collect(Collectors.toCollection(ArrayList::new));

        List<String> expected = Collections.emptyList();

        List<String> actual = subject.getRecentUnique(request, -5);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnThreeRecentUniques() {
        ArrayList<String> request = Stream.of("request1", "request2", "request3", "request1", "request3")
                                          .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> expected = Stream.of("request3", "request1", "request2")
                                           .collect(Collectors.toCollection(ArrayList::new));

        List<String> actual = subject.getRecentUnique(request, 3);

        assertThat(actual).isEqualTo(expected);
    }
}