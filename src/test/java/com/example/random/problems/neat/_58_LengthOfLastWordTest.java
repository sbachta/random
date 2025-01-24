package com.example.random.problems.neat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _58_LengthOfLastWordTest {

    private final _58_LengthOfLastWord subject = new _58_LengthOfLastWord();

    @Test
    void shouldReturn5ForLastWord() {
        int actual = subject.lengthOfLastWord("Hello World");

        assertThat(actual).isEqualTo(5);
    }

    @Test
    void shouldReturn4() {
        int actual = subject.lengthOfLastWord("   fly me   to   the moon  ");

        assertThat(actual).isEqualTo(4);
    }

    @Test
    void shouldReturn6() {
        int actual = subject.lengthOfLastWord("luffy is still joyboy");

        assertThat(actual).isEqualTo(6);
    }
}