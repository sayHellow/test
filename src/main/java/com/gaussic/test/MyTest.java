package com.gaussic.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lanxum on 2015/12/15.
 */
public class MyTest {

    @Test
    public void testLambda() {

        StringBuffer sb = new StringBuffer();
        sb.append("a");
        Runnable r = () -> {
            System.out.println("Howdy, world!");
            System.out.println(sb.toString());
        };
        sb.append("b");
        r.run();

        ///////////////////////////////////////////////////////////////////
        //New way:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.print(n));
        //or we can use :: double colon operator in Java 8
        list.forEach(System.out::print);
        ////////////////////////////////////////////////////////////////
        list.stream().filter(it -> it >= 5).forEach(System.out::print);

        list.stream().map((x) -> x * x).forEach(System.out::println);

        int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }

    @Test
    public void testStream(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter((x) -> {
            return x % 2 == 0;
        }).map((x) -> {
            return x * x;
        }).forEach(System.out::println);
    }

    @Test
    public void test(){


    }

}
