package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass1 {
    public static void main(String[] args) {

        Predicate<Integer> ram = x->x%2==0;
        boolean result = ram.test(23);
        System.out.println(result);
    }
}
