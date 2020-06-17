package eightKyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * AreaOfASquare.
 *
 * @author Oleg_Chemerisov
 */
public class AreaOfASquareTest {

    private static final double DELTA = 1e-15;

    @Test
    public void basicTests() {
        assertEquals(1.62, AreaOfASquare.squareArea(2), DELTA);
        assertEquals(0, AreaOfASquare.squareArea(0), DELTA);
        assertEquals(80, AreaOfASquare.squareArea(14.05), DELTA);
    }
}