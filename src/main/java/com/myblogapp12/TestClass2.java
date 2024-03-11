package com.myblogapp12;

import java.util.function.Predicate;

public class TestClass2 {
    public static void main(String[] args) {
        Predicate<String> val = str->str.equals("mike");
        boolean result = val.test("stallin");
        System.out.println(result);
    }
}
