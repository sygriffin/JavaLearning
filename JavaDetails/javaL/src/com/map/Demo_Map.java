package com.map;

import java.util.*;

/**
 * Created by songyang on 2019/4/4.
 */
public class Demo_Map {

    public static void main (String [] args) {

        //set底层依赖的是Map

        //由一对变成一个，很容易，一个变成一对，很难

        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        System.out.println(map);

        System.out.println(map.get("张三"));
        //获取每一个对象那个
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();


    }

}
