package com.hui.Interfaces;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + " say: Hello World!";
    }
}
