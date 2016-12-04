package com.example.di.xml;


/**
 * Created by apple on 2016/12/4.
 */
public class BeanForMethodInjection2 implements IBeanForMethodInjection {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void out() {
        System.out.println("this is BeanForMethodInjection2,name is " + name);
    }
}
