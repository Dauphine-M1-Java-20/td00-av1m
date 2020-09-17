package fr.dauphine.ja.mimounavi.td00;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/***
 * Allows to generate a list of random numbers and to check which are the prime
 * numbers
 */
public class PrimeCollection {
    private ArrayList<Integer> numbers = new ArrayList<>();

    /**
     * Allows to initialize {@code p} random numbers
     * 
     * @param n number of integers
     * @param m value to generate a random number
     */
    public void initRandom(int n, int m) {
        for (int i = 0; i < n; i++) {
            numbers.add(ThreadLocalRandom.current().nextInt(0, m));
        }
    }

    /**
     * Used to check if the number entered in parameter is prime Use
     * https://en.wikipedia.org/wiki/Prime_number
     * 
     * @param p number to check
     * @return true if {@code p} is prime
     */
    boolean isPrime(int p) {
        if (p <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(p); i++)
            if (p % i == 0)
                return false;
        return true;
    }

    /**
     * Affiche tous les nombres premiers qui ont été générés par la fonction
     * {@code this.initRandom()}
     */
    private void printPrimes() {
        for (int n : this.numbers) {
            if (this.isPrime(n))
                System.out.println(n + " is prime");
        }
    }

    public static void main(String[] args) {
        PrimeCollection pc = new PrimeCollection();
        pc.initRandom(100, 2000);
        pc.printPrimes();
    }
}
