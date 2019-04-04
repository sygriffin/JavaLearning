package com.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by songyang on 2019/4/4.
 */
public class TreeSetExercise {

    public static void main (String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ddd");
        arrayList.add("ccc");
        arrayList.add("fff");
        arrayList.add("heima");
        arrayList.add("fff");
        arrayList.add("IT");

        System.out.println(arrayList);

        sort(arrayList);

        System.out.println(arrayList);


        String string = "helloitcastt";
//        ArrayList<Character> arrayList1 = string.toCharArray();
        char [] arr = string.toCharArray();

        TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num = o1 - o2;
                return num == 0 ? 1:num;
            }
        });

        for (char c : arr) {
            ts.add(c);
        }

        for (Character ch : ts){
            System.out.print(ch);
        }

    }



    public static void sort (List<String> list) {

        //重写他的Comparator
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });

        treeSet.addAll(list);
        list.clear();
        list.addAll(treeSet);

    }


}
