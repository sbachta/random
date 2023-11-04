package com.example.random.problems;

//Get K recent unique requests.
//Input:
//requests = ["request1", "request2", "request3", "request1", "request3"]
//K = 3

//Output: ["request3", "request1", "request2"]

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class ProblemOne {

    public List<String> getRecentUnique(List<String> requests, Integer k) {

        return k > 0 ? IntStream.range(0, requests.size()).map(
                                        i -> requests.size() - 1 - i).mapToObj(requests::get)
                                .distinct()
                                .limit(k)
                                .collect(Collectors.toList())
                     : Collections.emptyList();

    }
}
