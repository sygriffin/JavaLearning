package com.basic;

import com.sy.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by songyang on 2019/4/3.
 */
public class Demo_Set {

    public static void main (String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        System.out.println(hashSet);
        //当向set集合中重复存储就返回false
        //hashSet重写了toString
        //无索引 -- 无序的集合

        //只要能用迭代器迭代的就能用增强for each

        //存储自定义对象保证元素的唯一性

        HashSet<Person> hashSet1 = new HashSet<>();

        hashSet1.add(new Person("张三",23));
        hashSet1.add(new Person("张三",23));
        hashSet1.add(new Person("张三",23));

        hashSet1.add(new Person("李四",24));
        hashSet1.add(new Person("李四",24));
        hashSet1.add(new Person("李四",24));

        System.out.println(hashSet1);

        //重写hashCode保证 -- 唯一，执行了isEqual
        //当hashCode一样的时候,才会执行equals

        System.out.println("=======================");

        //链表实现的HashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("a");

        System.out.println(linkedHashSet);

        //与HashSet原理一样

        HashSet<Integer> intSet = new HashSet<>();

        Random random = new Random();

        while (intSet.size() < 10) {

            Integer temp = random.nextInt(20) + 1;

            intSet.add(temp);

        }

        System.out.println(intSet);

        for (Integer i :
                intSet) {
            System.out.println(i);
        }

    }

}
