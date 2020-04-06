package com.lab.java8;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompileOrderTest {

    public static String staticField = "静态变量";
    static {
        System.out.println("静态语句块");

    }
    public String field = "实例变量";
    {
        System.out.println("普通语句块");
    }
//    最后才是构造函数的初始化。

    public CompileOrderTest() {
        System.out.println("构造函数");
        normalMethod();
    }
    public void normalMethod(){
        System.out.println("normalMethod");
    }
//    存在继承的情况下，初始化顺序为：
//
//    父类（静态变量、静态语句块）
//    子类（静态变量、静态语句块）
//    父类（实例变量、普通语句块）
//    父类（构造函数）
//    子类（实例变量、普通语句块）
//    子类（构造函数）
public static void main(String[] args) {
    new CompileOrderTest();
}
}
