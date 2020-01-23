package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        if (n < sortedNumbers[left] || n > sortedNumbers[right]) {                          // if number is greater or less than bounds of array, return -1
            return -1;
        }

        while (right >= left) {
            int mid = left + ((right - left) / 2);

            if (sortedNumbers[mid] == n) {                                                  // if number equals the middle number, return that index
                return mid;
            } else if (sortedNumbers[mid] > n) {
                right = mid - 1;                                                            // to prevent infinite loops, exclude the previous mid (had to get solution from the internet)
            } else if (sortedNumbers[mid] < n) {
                left = mid + 1;
            }
        }
        return -1;
    }

}
