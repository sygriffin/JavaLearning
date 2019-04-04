package com.basic;

import com.sy.Person;

import java.util.ArrayList;

/**
 * Created by songyang on 2019/4/3.
 */
public class Demo_ArrayListInArrayList {

    public static void main(String [] args) {

        ArrayList<ArrayList<Person>> list = new ArrayList<>();

        ArrayList<Person> first = new ArrayList<>();
        first.add(new Person("aaa",23));
        first.add(new Person("bbb",24));
        first.add(new Person("ccc",25));
        first.add(new Person("ddd",26));

        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("eee",18));
        second.add(new Person("fff",19));
        second.add(new Person("ggg",20));

        list.add(first);
        list.add(second);

        System.out.println(list);

    }

}
