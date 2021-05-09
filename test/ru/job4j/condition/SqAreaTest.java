package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);
    }

    @Test
    public void when8K4Square256() {
        double expected = 2.56;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);
    }


    @Test
    public void when256K12Square11633609() {
        double expected = 1163.3609;
        int p = 256;
        double k = 12;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);
    }

}