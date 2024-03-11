package com.myblogapp12;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        //System.out.println(new Random().nextInt(1000));
        Supplier<Integer> x = ()->new Random().nextInt(500);
        Integer y = x.get();
        System.out.println(y);
    }
}
