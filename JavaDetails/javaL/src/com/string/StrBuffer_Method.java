package com.string;

/**
 * Created by songyang on 2019/3/19.
 */
public class StrBuffer_Method {

    public static void main (String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb4 = new StringBuffer(10);
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());


        StringBuffer sb3 = new StringBuffer("heima");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());//字符串长度 + 初始容量




        //buffer的类方法

        //对比StringBuffer与StringBuilder 区别 -- buffer线程安全，builder线程不安全（速度更快）
        //capacity用法和OC/Swift的类似

        StringBuffer sb5 = new StringBuffer();
        System.out.println(sb5.toString());//buffer里面重写了ToString

        StringBuffer sb6 = sb5.append(true);
        StringBuffer sb7 = sb5.append("heima");
        StringBuffer sb8 = sb5.append(100);

        //5678四个引用指向同一个对象 -- 可变序列 -- 所以输出的都相同，都是在向原缓冲区添加

        System.out.println(sb6);
        System.out.println(sb7);
        System.out.println(sb8);

        StringBuffer sb9 = new StringBuffer("1234");

        try {
            sb9.insert(3,"heima");
            System.out.println(sb9);
        } catch (Exception e) {
            System.out.println(e);
        }

        //在指定位置添加 -- 其余的向后移


        StringBuffer sb10 = new StringBuffer("12345678990");
        System.out.println(sb10.deleteCharAt(1));
        System.out.println(sb10.delete(2,5));//注意，结束位置是指定位置前不包含本身（含头不含尾）

        //清空缓冲区 -- 直接全部delete掉

        //替换与反转

        StringBuffer sb11 = new StringBuffer("1234567890");
        System.out.println(sb11.replace(2,5,"111"));//仍然是含头不含尾
        System.out.println(sb11.reverse());

        ///字符buffer的截取 -- 会生成新的对象 （同样有Start,end）
        StringBuffer sb12 = new StringBuffer("1234567890");

        System.out.println(sb12.substring(5));

        System.out.println(sb12);





    }

}
