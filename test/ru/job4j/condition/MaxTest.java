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

    @Test
    public void maxOneTwoFifteen() {
        int a = 1;
        int b = 2;
        int c = 15;
        int expected = 15;
        int out = Max.max(a, b, c);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testMaxTwoFifteenOneTwoHundredTwentySix() {
        int a = 2;
        int b = 15;
        int c = 1;
        int d = 256;
        int expected = 256;
        int out = Max.max(a, b, c, d);
        Assert.assertEquals(expected, out);
    }
}