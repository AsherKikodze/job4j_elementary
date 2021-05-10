package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxLeft() {
        int left = 5;
        int right = 2;
        int expected = 5;
        int out = Max.max(left,right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxRight() {
        int left = 1;
        int right = 5;
        int expected = 5;
        int out = Max.max(left,right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxEquals() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int out = Max.max(left,right);
        Assert.assertEquals(expected, out);
    }

}