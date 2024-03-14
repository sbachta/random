package com.example.random.problems;

import com.example.random.models.BalanceStringResponse;
import org.springframework.stereotype.Component;

import static com.example.random.models.BalanceStringResponse.NO;
import static com.example.random.models.BalanceStringResponse.YES;

@Component
public class BalanceStrings {
            /*
        Given a strings of brackets, determine whether each sequence of brackets is balanced.
        If a string is balanced, return YES. Otherwise, return NO.

        All chracters in the sequences ∈ { {, }, (, ), [, ] }.

        Here are some use cases
        The string {[()]} meets both criteria for being a balanced string.

        {[()]} -> YES

        The string {[(])} is not balanced because the brackets enclosed by the matched pair { and } are not balanced: [(]).

        {[(])} -> NO

        The string {{[[(())]]}} meets both criteria for being a balanced string.
        {{[[(())]]}} -> YES

         */

    public BalanceStringResponse isBalanced(String input) {

        if((input.length() % 2 == 0)){
            final String first = input.substring(0, input.length()/2);
            final String second = input.substring((input.length()/2))
                                       .replace(")", "(")
                                       .replace("}", "{")
                                       .replace("]", "[");

            if(first.contentEquals(new StringBuilder(second).reverse())){
                return YES;
            }
        }
        return NO;
    }

}
