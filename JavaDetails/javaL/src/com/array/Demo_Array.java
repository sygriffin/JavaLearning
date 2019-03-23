package com.array;


import java.util.Arrays;

/**
 * Created by songyang on 2019/3/20.
 */
public class Demo_Array {

    public static void main (String[] args) {


        int[] arr = {33,22,11,66,55};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {11, 22, 33, 55, 66};
        //二分查找 -- 在数组是有序的前提下
        System.out.println(Arrays.binarySearch(arr,22));

        //不存在的元素，返回负的插入点-1
        System.out.println(Arrays.binarySearch(arr,88));








    }
}
