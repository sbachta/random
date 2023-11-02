package com.example.random.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListConstructor {

    @SafeVarargs
    public static <X> List<X> items(final X... items) {
        final List<X> list = new ArrayList<>();
        Collections.addAll(list, items);
        return list;
    }
}
