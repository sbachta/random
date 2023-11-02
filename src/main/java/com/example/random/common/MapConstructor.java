package com.example.random.common;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapConstructor {

    public static <X, Y> Map.Entry<X, Y> entry(final X key, final Y value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    @SafeVarargs
    public static <X, Y> Map<X, Y> mapOf(final Map.Entry<X, Y>... entries) {
        final Map<X, Y> map = new HashMap<>();
        for (final Map.Entry<X, Y> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
