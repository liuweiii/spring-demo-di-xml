package com.example.di.xml;

import java.util.*;

/**
 * Created by apple on 2016/12/3.
 */
public class BeanForCollections {
    private Properties myProps;
    private List list;
    private Map map;
    private Set set;

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void out(int id) {
        System.out.println("[" + id + "]this is BeanForCollections");
        StringBuilder sbProperties = new StringBuilder();
        for (Object key : myProps.keySet()) {
            sbProperties.append(key.toString() + "=" + myProps.get(key) + "  ");
        }
        System.out.println("myProps:  " + sbProperties);

        StringBuilder sbList = new StringBuilder();
        for (Object item : list) {
            sbList.append(item.toString() + "  ");
        }
        System.out.println("list: " + sbList);

        StringBuilder sbMap = new StringBuilder();
        for (Object key : map.keySet()) {
            sbMap.append(key.toString() + "=" + map.get(key) + "  ");
        }
        System.out.println("map: " + sbMap);

        StringBuilder sbSet = new StringBuilder();
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            sbSet.append(it.next());
        }
        System.out.println("set: " + sbSet);
    }

}
