package com.fib;

import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciUtil {

    private static Fibonacci recursive = new FibonacciRecursive(),
            iterative = new FibonacciIteration();

    public static Fibonacci getFibonacciRecursive() {
        return recursive;
    }

    public static Fibonacci getFibonacciIteration() {
        return iterative;
    }
}
