package com.basic;

import com.sy.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by songyang on 2019/3/25.
 */
public class Demo_Collection {

    public static void main(String[] args){

        //Collection -- List & Set


        //List -- ArrayList & LinkedList & Vector(这个东西被ArrayList替代掉了)

        //Set -- HashSet & TreeSet

        Collection c = new ArrayList();
        //注意泛型

        boolean b1 = c.add("aaa");
        boolean b2 = c.add("bbb");
        boolean b3 = c.add(true); //基本数据类型 -- 自动装箱
        boolean b4 = c.add(100); //
        boolean b5 = c.add(new Student("zhangsan",23));

//        Collection -- 添加任意类型
//        父类重写了ToString的方法，打印对象引用输出的不是Object的toString的结果
//        add方法在

        System.out.println(c);
        c.remove("aaa");
//        c.clear();
        c.contains("bbb");
        c.isEmpty();
        System.out.println(c);
        System.out.println("=================================");

        //转数组
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        System.out.println(c1);

        Object[] arr = c1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //all的功能
        Collection c2 = new ArrayList();
        c2.addAll(c1);
        System.out.println(c2);
        //removeAll 移除交集内容

        //containsAll 判断调用集合是否包含传入集合

        //retainAll 取两个集合的交集 -- 如果调用的集合改变就返回true，如果调用的集合不变就返回false（就看取得交集是否和原交集相同）

        //迭代器 -- Enumeration的代替版
        System.out.println("=================================");

        Iterator it = c1.iterator();
        System.out.println(it.hasNext());//判断是否有元素
        System.out.println(it.next());

        //迭代器原理 -- 向上抽取出接口

        //实际上就是一种抽取遍历过程的一种手段












    }

}
