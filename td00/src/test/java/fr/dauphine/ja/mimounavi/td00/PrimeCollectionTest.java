package fr.dauphine.ja.mimounavi.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest extends TestCase {
    PrimeCollection pc;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest(String testName) {
        super(testName);
        pc = new PrimeCollection();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(PrimeCollectionTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void test0IsPrime() {
        assertFalse(pc.isPrime(0));
    }

    public void testTwoIsPrime() {
        assertTrue(pc.isPrime(2));
    }

    public void test9IsNotPrime() {
        assertFalse(pc.isPrime(9));
    }
}
