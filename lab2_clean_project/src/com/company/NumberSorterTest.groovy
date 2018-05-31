package com.company
import org.junit.Assert

import static java.util.Arrays.asList;

class NumberSorterTest extends groovy.util.GroovyTestCase {
    void testIsPrimeZero() {
        Boolean result = NumberSorter.isPrime(0);
        assertFalse(result);
    }
    void testIsPrimeOne() {
        Boolean result = NumberSorter.isPrime(1);
        assertFalse(result);
    }
    void testIsPrimeActualPrime() {
        Boolean result = NumberSorter.isPrime(3);
        assertTrue(result);
    }
    void testIsPrimeNonPrime() {
        Boolean result = NumberSorter.isPrime(8);
        assertFalse(result);
    }

    void testConvertToBinary() {
        int[] result = NumberSorter.convertToBinary(127);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1));
        assertEquals(expected, result)
    }

    void testGetNumberWithMaxCountOf1() {
        java.lang.Integer result = NumberSorter.getNumberWithMaxCountOf1(1);
        java.lang.Integer expected = -1;
        assertEquals(expected, result);
    }
    void testGetNumberWithMaxCountOfNegative() {
        java.lang.Integer result = NumberSorter.getNumberWithMaxCountOf1(1);
        java.lang.Integer expected = -1;
        assertEquals(expected, result);
    }
}
