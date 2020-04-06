package com.lab.java8;


import com.lab.java8.Java8ApplicationTests;
import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface extends Java8ApplicationTests {
    /**
     * 接收一个参数 无返回值
     */
    @Test
   public void consumerTest(){
       String val="x1";
        Consumer<String> consumer=(x) ->System.out.println(x.replace("1","2"));
        consumer.accept(val);
        System.out.println(consumer);
    }
    @Test
    /**
     * 无输入参数 返回一个参数
     * 类似spring 懒加载机制
     */
   public void SupplierTest(){
        Supplier<String> supplier= String::new;
        String a=supplier.get();
        String b=supplier.get();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
