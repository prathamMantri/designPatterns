package com.pratham.designPatterns.factory;

public class Female implements Person{
    @Override
    public void wish() {
        System.out.println("Hello Female");
    }
}
