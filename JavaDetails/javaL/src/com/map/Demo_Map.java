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

        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<Integer> valueSet = map.values();
        System.out.println(valueSet);



        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("张三",23);
        hashMap.put("李四",24);
        hashMap.put("王五",25);
        hashMap.put("赵六",26);

        //获取每一个对象 根据键值对对象获取键和值
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> en = iterator.next();
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

        HashMap<HashMapObj, String> hm = new HashMap<>();
        hm.put(new HashMapObj("张三",23), "BJ");
        hm.put(new HashMapObj("李四",24), "SH");
        hm.put(new HashMapObj("王五",25), "SZ");
        hm.put(new HashMapObj("张三",23), "GZ");
        System.out.println(hm);

        //重写HashCode&equals方法 -- 去重

        //父类已经重写过toString这个方法了

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("zhangsan",23);
        lhm.put("lisi",24);
        lhm.put("zhangsan",23);
        lhm.put("wangwu",25);

        System.out.println(lhm);
        //








    }

}
