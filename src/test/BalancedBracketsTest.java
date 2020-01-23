package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void incorrectlyOrderedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleOpeningBracketsInARowReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void multipleClosingBracketsInARowReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void correctlyNestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void mixedSetOfIncorrectBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]][]["));
    }

    @Test
    public void correctlyOrderedBracketsWithinTextReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Random[Text]"));
    }

    @Test
    public void incorrectlyOrderedBracketsWithinTextReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Random]Text["));
    }

    @Test
    public void correctlyOrderedBracketsMixedWithCurlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("}[]{"));
    }

    @Test
    public void incorrectlyOrderedBracketsMixedWithCurlyBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{][}"));
    }

}
