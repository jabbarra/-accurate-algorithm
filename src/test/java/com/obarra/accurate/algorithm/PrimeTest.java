package com.obarra.accurate.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {

    @Test
    public void isPrime() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertTrue(Prime.isPrime(2));
        assertFalse(Prime.isPrime(12312137));
        assertFalse(Prime.isPrime(215));
        assertTrue(Prime.isPrime(199));
    }

    @Test
    public void generatePrimesBySieveOfEratosthenes() {
        // 30 -> [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
        System.out.println(Prime.generatePrimesBySieveOfEratosthenes(200));
        /*
        [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
         83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163,
                167, 173, 179, 181, 191, 193, 197, 199]*/

    }
}