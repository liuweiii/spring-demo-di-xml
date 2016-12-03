package com.example.di.xml;

/**
 * Created by apple on 2016/12/2.
 */
public class BeanForFactoryMethod {
    private String name;
    private int value;

    public BeanForFactoryMethod(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void out(int id) {
        System.out.println("["+id+"]"+"this is BeanForFactoryMethod,name is " + name + ",value is " + value);
    }
}
