package com.codewars.kata.solutions.eightKyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * APlusBTest.
 *
 * @author Oleg_Chemerisov
 */
public class APlusBTest {

    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, APlusB.sum(a, b));
    }
}