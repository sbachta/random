package com.example.random.common;

public class Empty extends Value<Empty>{
    private static final Empty INSTANCE = new Empty();

    private Empty() {
    }

    public static Empty empty() {
        return INSTANCE;
    }
}
