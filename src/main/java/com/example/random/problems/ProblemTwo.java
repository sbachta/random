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

        if(payments.size() > 1) {
            for(int i=1; i<=payments.size()-1; i++) {
                System.out.println("Current payment " + payments.get(i));
                System.out.println("Previous payment " + payments.get(i-1));
                int j=i-1;
                do {
                    if (payments.get(i).equals(payments.get(i - 1))) {
                        System.out.println("Last payments were equal");
                        if ((timeStamps.get(i) - timeStamps.get(i - 1)) <= timeLimit) {
                            System.out.println("Current payment was within timelimit of previous payment");
                            result.add("true");
                        } else {
                            result.add("false");
                        }
                    } else {
                        result.add("false");
                    }

                    j--;
                }while(j>=0);
            }
        }
        return result;

    }
}
