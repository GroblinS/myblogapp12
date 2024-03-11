package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 23, 34, 56, 18, 91);
        List<Integer> evennumbers = numbers.stream().filter(x -> x % 2==0).collect(Collectors.toList());
        System.out.println(evennumbers);
    }
}
