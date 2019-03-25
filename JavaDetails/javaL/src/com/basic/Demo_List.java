package com.basic;

import java.util.*;

/**
 * Created by songyang on 2019/3/25.
 */
public class Demo_List {

    public static void main (String[] args) {

        List list = new ArrayList();

//        ArrayList arrayList = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"d");

        System.out.println(list);

        //同样 存在remove get（获取） set（设置）
        System.out.println("=======================");

        List list1 = new ArrayList();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        ///注意 -- 删除时不会自动装箱的！！！

//        list1.remove(111); -- 不要这么删除了

        Object obj1 = list1.get(0);
        System.out.println(obj1);
        System.out.println("=======================");

        //并发写入报错 -- 如何解决
        List conList = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");
        list.add("e");

//        Iterator conIt = list.iterator();
//        while (conIt.hasNext()){
//            String str = (String) conIt.next();
//            if ("world".equals(str)) {
//                list.add("javaee");
//
//            }
//            System.out.println(list);
//
//        }
        //这个才可以迭代过程中添加
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String str = (String) lit.next();
            if ("world".equals(str)) {
                lit.add("javaee");

            }
            System.out.println(list);

        }

        //遍历的同时在增加元素 -- 并发修改


        //既然有next，就有previous
        lit.previous();

        ///被替换掉的Vector -- 很老旧，很像OC老式list

//        Vector v = new Vector();
//        v.addElement("a");
//        v.addElement("b");
//        v.addElement("c");
//
//        Enumeration en = v.elements();
//        en.hasMoreElements();
//        en.nextElement();

        //尽量使用ArrayList了 --
        System.out.println("=======================");
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.addFirst("d");
        linkedList.addLast("e");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

//        LinkedList模拟栈



    }
}
