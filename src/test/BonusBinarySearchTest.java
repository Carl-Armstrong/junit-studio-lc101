package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] smallArray = new int[] {1,2,3};
    int[] mediumArray = new int[] {1,4,6,7};
    int[] largeArray = new int[] {1,2,3,4,5,6,7,8,9};


    @Test
    // a simple array with the number being found on the left side
    public void threeNumbersWithQueryFoundOnLeft() {
        assertEquals(0, BonusBinarySearch.binarySearch(smallArray, 1));
    }

    @Test
    // a simple array with the number being found in the middle
    public void threeNumbersWithQueryFoundInMiddle() {
        assertEquals(1,BonusBinarySearch.binarySearch(smallArray, 2));
    }

    @Test
    // a simple array with the number being found on the right side
    public void threeNumbersWithQueryFoundOnRight() {
        assertEquals(2, BonusBinarySearch.binarySearch(smallArray, 3));
    }

    @Test
    // a simple array which does not include the number being searched for
    public void threeNumbersWhichDontContainQuery() {
        assertEquals(-1, BonusBinarySearch.binarySearch(smallArray, 4));
    }

    @Test
    // a slightly larger array with the number on the left
    public void fourNumbersWithQueryOnLeft() {
        assertEquals(0, BonusBinarySearch.binarySearch(mediumArray, 1));
    }

    @Test
    // a slightly larger array with the number on the right
    public void fourNumbersWithQueryOnRight() {
        assertEquals(2, BonusBinarySearch.binarySearch(mediumArray, 6));
    }

    @Test
    // a slightly larger array with the number within the min and max but not included in the array
    public void fourNumbersWithQueryInBoundsButNotInArray() {
        assertEquals(-1, BonusBinarySearch.binarySearch(mediumArray, 3));
    }

    @Test
    // a larger array to ensure it works with larger scope
    public void largeArrayToTestThatItStillWorks() {
        assertEquals(5, BonusBinarySearch.binarySearch(largeArray, 6));
    }

}
