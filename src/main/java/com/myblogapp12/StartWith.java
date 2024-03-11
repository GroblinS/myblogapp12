package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("deepak","pushpendra","mike","mayank","manik","mayank");
        //List<String> startsWith1 = list.stream().filter(str -> str.startsWith("m")).collect(Collectors.toList());
        //List<String> startsWith2 = list.stream().filter(str -> str.equals("mayank")).collect(Collectors.toList());
        List<String> startsWith3 = list.stream().filter(str -> str.endsWith("a")).collect(Collectors.toList());
        //System.out.println(startsWith1);
        //System.out.println(startsWith2);
        System.out.println(startsWith3);
    }
}
