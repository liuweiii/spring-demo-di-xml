package com.example.di.xml;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * Created by apple on 2016/12/4.
 */
public abstract class MethodInjection {
    public abstract IBeanForMethodInjection createBeanForMethodInjection();

    public void out(int id){
        System.out.println("["+id+"]this is MethodInjection.");
        createBeanForMethodInjection().out();
    }
}
