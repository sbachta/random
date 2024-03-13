package com.example.random.problems;

/*
Summary of the requirements:

- If the time difference between the current payment and the last payment made between the same sender and the same
    receiver is strictly less than the time limit, the function should return "true".
- The payments are given as a 2D array payments, where each element is a pair [senderID, receiverID].
- The corresponding timestamp for each payment is given in the timestamps array, which is sorted in ascending order.
- Use the combination of senderID and receiverID to uniquely identify a payment.
*/

import org.springframework.data.util.Pair;
import java.util.List;

import static com.example.random.common.ListConstructor.items;

public class ProblemTwo {


    public List<String> getPaymentConfirmationStatus(
            List<Integer> timeStamps,
            List<Pair<Integer, Integer>> payments,
            Integer timeLimit
    ) {

        List<String> result = items("false");

        for (int i=1; i<=payments.size()-1; i++) {
            for(int j=i-1; j>=0; j--) {
                if (payments.get(i).equals(payments.get(j)) && ((timeStamps.get(i) - timeStamps.get(j)) < timeLimit) ||
                    (payments.get(i).getFirst().equals(payments.get(i).getSecond()))) {
                    result.add("true");
                    break;
                }
                if(j==0){
                    result.add("false");
                }
            }
        }

        return result;
    }
}
