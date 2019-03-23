package com.string;

/**
 * Created by songyang on 2019/3/12.
 */
public class Demo_String {

    public static void main (String[] args) {

        String str = "abc";
        str = "def";

        char[] arr = {'a','b','c'};
        String str1 = new String(arr);
        System.out.println(str1);

        System.out.println("++++++++++++++++++++++++++++");
        //参考Swift对值类型与引用类型的定义 -- 值类型肯定是，相等的
        //这与引用类型的对象的概念，是区分开的

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("++++++++++++++++++++++++++++");
        //下面这句话：创建了2个对象
        //参考Swift3 -- 操作字符串都是它的copy
        String s3 = new String("abc");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        //java中有常量优化机制（参考swift中的常量优化机制）
        //编译时
        System.out.println("++++++++++++++++++++++++++++");
        String s4 = "a"+"b"+"c";
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        //关于"+"append的优化
        System.out.println("++++++++++++++++++++++++++++");
        String s5 = "ab";
        String s6 = s5 + "c";
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s6));


    }

}
