package com.example.random.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BalanceStringsTest {

    private final BalanceStrings subject = new BalanceStrings();

    @Test
    void shouldReturnNoWhenInputIsOdd() {
        final String input = "{[(])}}";

        String actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo("NO");
    }

    @Test
    void shouldReturnYesWhenInputIsEven() {
        final String input = "{{[[(())]]}}";

        String actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo("YES");
    }

    @Test
    void shouldReturnNoWhenInputIsEvenButNotBalanced() {
        final String input = "{{[[(())]]";

        String actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo("NO");
    }

}