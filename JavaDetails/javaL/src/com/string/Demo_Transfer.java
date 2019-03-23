package com.string;


import java.util.ArrayList;

/**
 * Created by songyang on 2019/3/20.
 */
public class Demo_Transfer {

    public static void main (String[] args) {

        //String与Buffer转换

        //String to buffer

        String str = "asd";

        String str1 = new String("asd");

        System.out.println(str.equals(str1));
        System.out.println("asd".equals(str1));
        System.out.println("asd".equals(str));

        StringBuffer buffer = new StringBuffer("asd");
        StringBuffer buffer1 = new StringBuffer();

        buffer1.append("asd");

        System.out.println(buffer.equals(buffer1));

        //此时"asd"在内存中有几个？ -- 注意String是在内存中做了优化的 ==》而正常的其他对象有问题

        String string = new String(buffer);
        System.out.println(string);

        String string2 = buffer.toString();
        System.out.println(string2);
        String string3 = buffer.substring(0,1);
        System.out.println(string3);
        //直接截取 -- 也可从buffer -> 字符串

        //用StringBuffer --> ArrayToString
        int [] arr = {1,2,5};
        System.out.println(arrayToString(arr));
        //用String会过多的产生垃圾

        System.out.println(buffer.reverse());

        //String和Buffer和Builder ==> 区别


        //String与StringBuffer作为参数的传递

        String trans_s = "heima";
        System.out.println(trans_s);


        //String类虽为引用数据类型，但是当做参数传递时，是与基本数据类型，一样的，值不会被改变
        //Buffer类当做参数传递时，值是随之而改变的






























    }

    public static String arrayToString(int[] arr) {

        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < arr.length; i ++) {

            if (i == arr.length-1) {
                sb.append(arr[i] +"]");
            } else {
                sb.append(arr[i] + ",");
            }
        }



        return sb.toString();
    }

}
