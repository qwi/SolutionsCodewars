package eightKyu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CountOddNumbersBelowN.
 *
 * @author Oleg_Chemerisov
 */
public class CountOddNumbersBelowNTest {

    @Test
    public void fixedTests() {
        assertEquals(7, CountOddNumbersBelowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBelowN.oddCount(15023));
    }
}