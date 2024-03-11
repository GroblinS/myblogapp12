package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
//    Consumer<Integer> result = numbers-> System.out.println(numbers);
//    result.accept(100);
    List<String> names = Arrays.asList("mike","adam","sam");
    Consumer<String> val = name-> System.out.print(name+",");
    names.forEach(val);
    }
}

