package com.pratham.designPatterns.factory;

public class TestPerson {

    public static void main(String args[]){
        PersonFactory personFactory = new PersonFactory();
        personFactory.wishPerson("male");
        personFactory.wishPerson("female");
    }
}
