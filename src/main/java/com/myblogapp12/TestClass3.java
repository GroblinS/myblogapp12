package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass3 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,20,23,14,17,19,25,20);
        List<Integer> val = data.stream().distinct().collect(Collectors.toList());
        System.out.println(val);
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
