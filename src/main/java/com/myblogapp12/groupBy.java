package com.myblogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupBy {
    public static void main(String[] args) {
    List<Employee> employee = Arrays.asList(
        new Employee("mike",35,"chennai"),
        new Employee("stallin",35,"pune"),
        new Employee("adam",45,"chennai"),
        new Employee("john", 56,"bengalore")
    );
        Map<String, List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(x -> x.getCity()));
        for (Map.Entry<String , List<Employee>> entry : collect.entrySet()){
            String city = entry.getKey();
            List<Employee>  employeesWithAge = entry.getValue();
            System.out.println("city:"+city+"----");
            for (Employee e : employeesWithAge){
                System.out.println(e.getCity());
                System.out.println(e.getName());
                System.out.println(e.getAge());
            }
        }
    }
}
