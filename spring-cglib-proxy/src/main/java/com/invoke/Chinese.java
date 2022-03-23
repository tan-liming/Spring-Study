package com.invoke;

public class Chinese implements Person{

    @Override
    public void eat(String food) {
        System.out.println("Chinese like " + food);
    }
}
