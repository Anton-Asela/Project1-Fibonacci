package com.fib;

import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciRecursive implements Fibonacci {

    private HashMap<Integer, BigInteger> memento = new HashMap<>();

    @Override
    public BigInteger fibonacci(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Fibonacci is not defined for values less than one");
        }

        if (!memento.containsKey(number)) {
            BigInteger fib = BigInteger.ONE;
            if (number > 2) {
                fib = this.fibonacci(number - 1).add(fibonacci(number - 2));
            }
            memento.put(number, fib);
        }
        return memento.get(number);
    }
}
