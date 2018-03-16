package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Test
    public void shouldReturnString() {
        Example example = new Example();
        Byte[] array = new Byte[10];
        array[1] = Byte.valueOf("stuff");
        array[2] = Byte.valueOf("more");
        array[3] = Byte.valueOf("stuff two");

        String expected = example.byteToString(array);

        assertThat(expected).isEqualTo("stuffmorestuff two");
    }
}