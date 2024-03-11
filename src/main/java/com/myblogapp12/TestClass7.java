package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass7 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("deepak","rajat","ayush","piyush");
        List<String> data = numbers.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(data);
    }
}
