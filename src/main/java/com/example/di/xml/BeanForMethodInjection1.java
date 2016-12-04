package com.example.di.xml;


/**
 * Created by apple on 2016/12/4.
 */
public class BeanForMethodInjection1 implements IBeanForMethodInjection {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void out() {
        System.out.println("this is BeanForMethodInjection1,name is " + name);
    }
}
