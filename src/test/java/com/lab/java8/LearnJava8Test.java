package com.lab.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class LearnJava8Test extends Java8ApplicationTests{
    @Test
    public void contextLoads() {
        Consumer<String> a =new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        a.accept("test");
    }
    @Test
    public void test1(){
       ArrayList a=new ArrayList<>(Arrays.asList("a","b0","s"));
        Assert.assertFalse(   Collections.emptyList().equals(a));


    }
}
