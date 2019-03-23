package com.basic;

/**
 * Created by songyang on 2019/3/23.
 */
public class Demo_basic {

    public static void main (String[] args) {

        //基本数据类型的包装

        //理解：全部都是基本数据类型的类方法 --

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new Integer(12));
        System.out.println(new Integer("12"));

        //int 与 String 互换

        int i= 100;
        String s1 = i +"";//写法简单
        String s2 = String.valueOf(i);//强力推荐
        System.out.println(Integer.toString(i));

        String s = "200";
        Integer i3 = new Integer(s);
        //如何将Integer转换为Int
        System.out.println(i3.intValue());

        System.out.println(Integer.parseInt(s));

        //parse转换 -- 除了Character类型剩下的都有

        //自动装箱与拆箱

        Integer auto_1 = 200;//装箱基本数据类型转换成对象

        int z = auto_1 + 100;//拆箱把对象转换为基本数据类型
        //注意：装箱拆箱的值不能为null

        //可能出现问题的地方 -- 注意事项

        //装箱过的Int比较 -- -128->+127 byte取值范围内，自动装箱就不会新创建对象，而是从常量池获取 -- 超过byte取值范围就新创建对象

        Integer ss1 = new Integer(i);
        Integer ss2 = new Integer(i);

        System.out.println(ss1 == ss2);
        System.out.println(ss1.equals(ss2));

        Integer ss3 = 126;
        Integer ss4 = 126;
        System.out.println(ss3 == ss4);
        System.out.println(ss3.equals(ss4));

        Integer ss5 = 129;
        Integer ss6 = 129;
        System.out.println(ss5 == ss6);
        System.out.println(ss5.equals(ss6));



    }

}
