package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void testNewClass() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumOne() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testSumThree() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void testSumZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}