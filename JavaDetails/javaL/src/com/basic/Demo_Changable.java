package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by songyang on 2019/4/3.
 */
public class Demo_Changable {

    public static void main(String[] args) {

        int [] arr = {11,22,44,55};
        print(arr);

        print(11,22,33,44,55);
//        print();
        print1(11,22,33,44,55);


        //asList

        String[] arrString = {"11","22","33"};
        List<String> list = Arrays.asList(arrString);
        //数组转集合不能增加或者减少元素，但可以用集合的思想操作数组，也就是说可以使用集合中的方法
//        list.add("44");

        int[] arrInt = {11,22,33,44};
        List<int[]> list1 = Arrays.asList(arrInt);
        System.out.println(list1); //将数组当做一个对象打印出来了

        //如何将数组转换成集合 -- 数组转集合，数组必须是引用数据类型
        Integer[] arrInt1 = {11,22,33,44};
        List<Integer> list2 = Arrays.asList(arrInt1);
        System.out.println(list2); //将数组当做一个对象打印出来了

        //拥有自己的泛型 -- toArray
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        String [] strArr = arrayList.toArray(new String[10]);
        for (String str : strArr) {
            System.out.println(str);
        }
        //当转换数组时，数组的长度如果是小于等于集合的size --> 转换后的数组长度等于集合的size
        //长度大于size ，分配的长度与指定的长度一样



    }

    //可变参数 -- 一个方法有多参数，可变参数一定在最后

//    public static void print(int [] arr) {
//        for (int i = 0;i < arr.length; i ++ ) {
//            System.out.println(arr[i]);
//        }
//
//    }

    public static void print(int...arr) { //可变参数其实是一个数组 -- 底层相当于是一个数组
        for (int i = 0;i < arr.length; i ++ ) {
            System.out.println(arr[i]);
        }

    }
    public static void print1(int x, int...arr) { //可变参数其实是一个数组 -- 底层相当于是一个数组
        for (int i = 0;i < arr.length; i ++ ) {
            System.out.println(arr[i]);
        }

    }

}
