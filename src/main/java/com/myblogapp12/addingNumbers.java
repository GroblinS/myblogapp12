package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class addingNumbers {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10, 12, 34, 14, 15, 7);
//        List<Integer> addingNumbers = list.stream().map(i -> i + 5).collect(Collectors.toList());
//        System.out.println(addingNumbers);


//        List<String> list = Arrays.asList("pushpendra", "stallin", "mike", "john");
//        List<String> collect = list.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String>list = Arrays.asList("mike","adam","stallin","smith");
//        List<String> collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);
        List<Integer>list = Arrays.asList(10,20,2,3,12,4);
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
