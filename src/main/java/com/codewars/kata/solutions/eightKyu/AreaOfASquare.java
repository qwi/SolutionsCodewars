package com.codewars.kata.solutions.eightKyu;

/**
 * AreaOfASquare.
 * @author Oleg_Chemerisov
 *
 * Complete the function that calculates the area of the red square,
 * when the length of the circular arc A is given as the input.
 * Return the result rounded to two decimals.
 */
public class AreaOfASquare {
    public static double squareArea(double A) {
        return Math.round(Math.pow((2 * A / Math.PI), 2) * 100.0) / 100.0;
    }
}
