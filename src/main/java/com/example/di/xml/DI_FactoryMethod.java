package com.example.di.xml;

/**
 * Created by apple on 2016/12/2.
 */
public class DI_FactoryMethod {
    public static BeanForFactoryMethod createInstance(String myName, int myValue){
        return new BeanForFactoryMethod(myName, myValue);
    }
}
