package com.codewars.kata.solutions.eightKyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * IsItANumberTest.
 *
 * @author Oleg_Chemerisov
 */
public class IsItANumberTest {

    IsItANumber myUtil = new IsItANumber();

    @Test
    public void test0() throws Exception {
        assertEquals(false, myUtil.isDigit("s2324"));
    }

    @Test
    public void test1() throws Exception {
        assertEquals(true, myUtil.isDigit("-234.4"));
    }
}