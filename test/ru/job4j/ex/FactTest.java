package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test
    public void if5then120() {
        int res = new Fact().calc(5);
        assertThat(res, is(120));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifMinus3thenErr() {
        int res = new Fact().calc(-3);
    }
}