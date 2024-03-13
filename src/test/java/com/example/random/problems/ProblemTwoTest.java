package com.example.random.problems;

import org.junit.jupiter.api.Test;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static com.example.random.common.ListConstructor.items;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProblemTwoTest {

    ProblemTwo subject = new ProblemTwo();

    @Test
    void shouldReturnFalseForNotDuplicateTransactionWithinTimeLimit() {
        List<Integer> timestamps = items(1, 4);
        List<Pair<Integer, Integer>> payments = new ArrayList<>(List.of(
                Pair.of(1, 2),
                Pair.of(25, 65)
        ));
        Integer timeLimit = 5;

        final List<String> expected = items("false", "false");
        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timeLimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueForDuplicateTransactionWithinTimeLimit() {
        List<Integer> timestamps = items(1, 2);
        List<Pair<Integer, Integer>> payments = new ArrayList<>(List.of(
                Pair.of(1, 2),
                Pair.of(1, 2)
        ));
        Integer timeLimit = 5;

        final List<String> expected = items("false", "true");
        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timeLimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseForDuplicateTransactionWithinTimeLimit() {
        List<Integer> timestamps = items(1, 5);
        List<Pair<Integer, Integer>> payments = new ArrayList<>(List.of(
                Pair.of(1, 2),
                Pair.of(1, 2)
        ));
        Integer timeLimit = 2;

        final List<String> expected = items("false", "false");
        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timeLimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void first() {
        List<Integer> timestamps = items(1, 4, 5, 10, 11, 14);
        List<Pair<Integer, Integer>> payments = new ArrayList<>(List.of(
                Pair.of(1, 2),
                Pair.of(25, 65),
                Pair.of(25, 65),
                Pair.of(1, 2),
                Pair.of(25, 65),
                Pair.of(1, 2)
        ));
        Integer timeLimit = 5;

        final List<String> expected = items("false", "false", "true", "false", "false", "true");
        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timeLimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void second() {
        List<Integer> timestamps = items(1, 1, 1, 11, 13, 14);
        List<Pair<Integer, Integer>> payments = items(
                Pair.of(1, 2),
                Pair.of(1, 1),
                Pair.of(25, 35),
                Pair.of(1, 2),
                Pair.of(11, 1),
                Pair.of(1, 11)
        );
        Integer timelimit = 5;

        final List<String> expected = items("false", "true", "false", "false", "false", "false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void third() {
        List<Integer> timestamps = items(1);
        List<Pair<Integer, Integer>> payments = items(Pair.of(1, 2));
        Integer timelimit = 5;

        final List<String> expected = items("false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fourth() {
        List<Integer> timestamps = items(23,23,52,52,180,180);
        List<Pair<Integer, Integer>> payments = items(
                Pair.of(50,51),
                Pair.of(55,90),
                Pair.of(50,51),
                Pair.of(55,90),
                Pair.of(14,94),
                Pair.of(50,51)
        );
        Integer timelimit = 55;

        final List<String> expected = items("false", "false", "true", "true", "false", "false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fifth() {
        List<Integer> timestamps = items(1,2,5,10);
        List<Pair<Integer, Integer>> payments = items(
                Pair.of(3,4),
                Pair.of(3,4),
                Pair.of(3,4),
                Pair.of(3,4)
        );
        Integer timelimit = 5;

        final List<String> expected = items("false", "true", "true", "false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sixth() {
        List<Integer> timestamps = items(1, 2, 4, 6, 11, 12);
        List<Pair<Integer, Integer>> payments = items(
                Pair.of(1, 2),
                Pair.of(41, 5),
                Pair.of(41, 6),
                Pair.of(41, 6),
                Pair.of(41, 6),
                Pair.of(4, 16)
        );
        Integer timelimit = 5;

        final List<String> expected = items("false", "false", "false", "true", "false", "false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void seventh() {
        List<Integer> timestamps = items(1, 4, 8, 13);
        List<Pair<Integer, Integer>> payments = items(
                Pair.of(1, 2),
                Pair.of(1, 2),
                Pair.of(1, 2),
                Pair.of(1, 2)
        );
        Integer timelimit = 5;

        final List<String> expected = items("false", "true", "true", "false");

        List<String> actual = subject.getPaymentConfirmationStatus(timestamps, payments, timelimit);

        assertThat(actual).isEqualTo(expected);
    }
}