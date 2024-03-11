package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 21, 23, 2, 4, 6, 7);
        List<Integer> odd = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);
    }
}
