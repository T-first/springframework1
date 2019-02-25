package com.lambda;

import java.util.Arrays;
import java.util.List;

public class Test_1 {

    public static void main(String[] args) {

        String [] strings = new String[]{"jack1","jack2","jack3"};
//        for (String s : strings
//             ) {
//            x -> System.out.println();
        List<String> list =Arrays.asList(strings);

        list.forEach(l-> System.out.println(l));

        list.forEach(System.out::println);
        }



}
