package com.basic;

import com.sy.Person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by songyang on 2019/4/3.
 */
public class Demo_TreeSet {

    public static void main (String [] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(2);
        ts.add(2);
        ts.add(3);
        ts.add(3);

        //TreeSet 排序，并且保证元素唯一

        TreeSet<Person> ts1 = new TreeSet<>();

        ts1.add(new Person("zhangsan",23));
        ts1.add(new Person("zhangsan",23));
        ts1.add(new Person("lisi",24));
        ts1.add(new Person("wangwu",25));

        System.out.println(ts1);

        //按照什么条件比较 -- 排序 == 直接打印就报错了
        /** compareTo
         *  返回0 -- 只有一个元素
         *  返回正数 -- 集合会正序输出（怎么存的怎么取）
         *  返回负数 -- 集合会倒序输出（反着来）
         */

         //TreeSet 如何存储元素决定于compareTo的返回值
         //
         //

        //Comparator -- 比较器 -- 接口

        TreeSet<String> ts3 = new TreeSet<>(new CompareByLength());
        ts3.add("aaaaaaaaaaaaa");

        ts3.add("ba");
        ts3.add("nba");
        ts3.add("cba");
        ts3.add("waac");
        ts3.add("z");
        ts3.add("asdasdad");
        ts3.add("11111");

        System.out.println(ts3);//字符串长度升序

        //TreeSet -- 自然顺序Comparable -- compareTo方法
        //比较器顺序 -- Comparator -- compare方法



    }

}

class CompareByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        //按照字符串长度比较
        int num = o1.length() -o2.length();

        return num == 0 ? o1.compareTo(o2):num;
    }
}