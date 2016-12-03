package com.example.di.xml;

/**
 * Created by apple on 2016/12/2.
 */
public class DI_Constructor {
    private SubBean subBean;
    private int index;
    private String name;
    private String description;

    public DI_Constructor(SubBean subBean, int index, String name, String myDescription) {
        this.subBean = subBean;
        this.index = index;
        this.name = name;
        this.description = myDescription;
    }

    public void out(int id) {
        System.out.println("["+id+"]this is DI_Constructor,index is " + index + ",name is " + name+",description is "+description);
        subBean.out();
    }
}
