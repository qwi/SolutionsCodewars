package eightKyu;

/**
 * IsItANumber.
 *
 * @author Oleg_Chemerisov
 * <p>
 * Given a string s, write a method (function) that will return true if
 * its a valid single integer or floating number or false if its not.
 */
public class IsItANumber {
    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}