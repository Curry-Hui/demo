package com.hui;

import com.hui.Interfaces.HelloServiceImpl;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world!");
        System.out.println(new HelloServiceImpl().sayHello("Jack"));
    }
}
