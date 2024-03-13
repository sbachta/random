package com.example.random.problems;

import org.springframework.stereotype.Component;

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

    //get overall length
    //check odd vs even
    //odd return no
    //if even substring input to split into two different string arrays
    //stream one side to reverse the second string array
    //simple comparison to check if string are equal
    //based on that return yes/no

    //refactor return type to be enum
    //refactor stream the whole thing

    public String isBalanced(String input) {
        if((input.length() % 2 == 0)){
            final String first = input.substring(0, input.length()/2);
            String second = input.substring((input.length()/2));
            second = second.replace("]", "[");
            second = second.replace("}", "{");
            second = second.replace(")", "(");
            String reversedSecond = "";

            for(int i=second.length()-1; i>=0; i--){
                reversedSecond = reversedSecond.concat(second.substring(i, i+1));
            }

            if(first.equals(reversedSecond)){
                return "YES";
            }
        }
        return "NO";
    }

}
