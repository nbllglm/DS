package com.gz.test.lambda;

import com.gz.test.Person;

public class testLambdaDemo4 {
    public static void main(String[] args) {
        System.out.println(newPerson("aasd",Person::new));
    }
     static Person newPerson(String name, testLambda4 testLambda4){
        return testLambda4.buildPerson(name);
    }
}
