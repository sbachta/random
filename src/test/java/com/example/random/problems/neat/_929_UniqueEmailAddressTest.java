package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _929_UniqueEmailAddressTest {

    private final _929_UniqueEmailAddress subject = new _929_UniqueEmailAddress();

    @Test
    void exampleOne() {
        String[] input = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        int actual = subject.numUniqueEmails(input);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void exampleTwo() {
        String[] input = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};

        int actual = subject.numUniqueEmails(input);

        assertThat(actual).isEqualTo(3);
    }
}