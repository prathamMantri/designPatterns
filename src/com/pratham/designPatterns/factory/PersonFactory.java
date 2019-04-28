package com.pratham.designPatterns.factory;

public class PersonFactory {

    public void wishPerson(String gender){
        Person person = null;

        if(gender.equals("male")){
            person = new Male();
        }else if(gender.equals("female")){
            person = new Female();
        }

        person.wish();

    }




}
