package com.example.random.problems;

import com.example.random.models.BalanceStringResponse;
import org.junit.jupiter.api.Test;

import static com.example.random.models.BalanceStringResponse.NO;
import static com.example.random.models.BalanceStringResponse.YES;
import static org.assertj.core.api.Assertions.assertThat;

class BalanceStringsTest {

    private final BalanceStrings subject = new BalanceStrings();

    @Test
    void shouldReturnNoWhenInputIsOdd() {
        final String input = "{[(])}}";

        BalanceStringResponse actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo(NO);
    }

    @Test
    void shouldReturnYesWhenInputIsEven() {
        final String input = "{{[[(())]]}}";

        BalanceStringResponse actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo(YES);
    }

    @Test
    void shouldReturnNoWhenInputIsEvenButNotBalanced() {
        final String input = "{{[[(())]]";

        BalanceStringResponse actual = subject.isBalanced(input);

        assertThat(actual).isEqualTo(NO);
    }

}