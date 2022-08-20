package com.fib;

import java.math.BigInteger;

public interface Fibonacci {

    default BigInteger fibonacci(int number) {
        throw new UnsupportedOperationException();
    }

}
