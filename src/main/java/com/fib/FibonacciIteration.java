package com.fib;

import java.math.BigInteger;

public class FibonacciIteration implements Fibonacci{

    @Override
    public BigInteger fibonacci(int number) {
        if(number < 1) {
            throw new IllegalArgumentException("Fibonacci is not defined for values less than one");
        }
        if(number < 3) {
            return BigInteger.ONE;
        }
        BigInteger first=BigInteger.ONE, second=BigInteger.ONE,
                third=BigInteger.TWO;
        for(int i = 3; i <= number;i++) {
            third = first.add(second);
            first = second;
            second = third;
        }
        return third;
    }
}
