package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass8 {
    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList (
//                new Employee("mike", 30, "chennai"),
//                new Employee("adam",45,"chennai"),
//                new Employee("stallin",31,"pune"),
//                new Employee("mike",25,"benglore")
//            );
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() >30).collect(Collectors.toList());
//        for (Employee e: emps){
//            System.out.println(e.getName());
//            System.out.println(e.getCity());
//            System.out.println(e.getAge());
//        }

        List<Integer> numbers = Arrays.asList(10,12,13,8,21,11,4);
        List<Integer> collect = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
        System.out.println(collect);

    }
}
