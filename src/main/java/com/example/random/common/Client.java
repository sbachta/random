package com.example.random.common;

public interface Client<REQUEST, RESPONSE> {

    RESPONSE send(REQUEST request);
}
