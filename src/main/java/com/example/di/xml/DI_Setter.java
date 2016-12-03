package com.example.di.xml;

/**
 * Created by apple on 2016/12/2.
 */
public class DI_Setter {
    private SubBean mySubBean;
    private String name;
    private int index;

    public void setMySubBean(SubBean subBean){
        this.mySubBean = subBean;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIndexXXX(int index){
        this.index = index;
    }

    public void out(int id){
        System.out.println("["+id+"]"+"this is DI_Setter, name is "+name+", index is "+index);
        mySubBean.out();
    }
}
