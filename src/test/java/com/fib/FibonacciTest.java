package com.fib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

// 1,1,2,3,5,8,13,21
public class FibonacciTest {

    private Fibonacci fibonacci = FibonacciUtil.getFibonacciRecursive();

    @Test
    void firstFibonacci_shouldBeOne() {
        Assertions.assertEquals(BigInteger.ONE, fibonacci.fibonacci(1));
    }

    @Test
    void secondFibonacci_shouldBeOne() {
        Assertions.assertEquals(BigInteger.ONE, fibonacci.fibonacci(2));
    }

    @Test
    void thirdFibonacci_shouldBeTwo() {
        Assertions.assertEquals(BigInteger.TWO, fibonacci.fibonacci(3));
    }

    @Test
    void fourthFibonacci_shouldBeThree() {
        Assertions.assertEquals(BigInteger.TWO.add(BigInteger.ONE), fibonacci.fibonacci(4));
    }

    @Test
    void eighthFibonacci_shouldBe_21() {
        Assertions.assertEquals(BigInteger.valueOf(21L), fibonacci.fibonacci(8));
    }

    @Test
    void twentiethFibonacci_shouldBe_6765() {
        Assertions.assertEquals(BigInteger.valueOf(6765L), fibonacci.fibonacci(20));
    }

    @Test
    void zerothFibonacci_shouldTrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> { fibonacci.fibonacci(0);});
    }

    @Test
    void FiftiethFibonacci_shouldFinishWithin10S() {
        Assertions.assertTimeout(Duration.of(1, ChronoUnit.MILLIS), () ->  fibonacci.fibonacci(50));
        Assertions.assertEquals(BigInteger.valueOf(12_586_269_025L), fibonacci.fibonacci(50));
    }


    @Test
    void HundredthFibonacci_shouldFinishWithin10S() {
        Assertions.assertTimeout(Duration.of(1, ChronoUnit.MILLIS), () ->  fibonacci.fibonacci(100));
    }

}
