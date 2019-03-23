package com.basic;

/**
 * Created by songyang on 2019/3/23.
 */
public class Demo_regex {

    public static void main(String[] args) {

        //String -- matches方法 -- 返回

        String string1 = "123432423";
        String string2 = "0123123";
        String string3 = "12343242312312321312";
        String regex = "[1-9]\\d{4,14}";
        System.out.println(string1.matches(regex));
        System.out.println(string2.matches(regex));
        System.out.println(string3.matches(regex));//超位数也是false

        //正则表达式 -- 都是matches

        /**
         *  []代表单个字符
         *  [^]代表非单个字符
         *  [a-zA-Z]包含头尾的范围
         *  [a-z&&[def]] -- 交集（d,e或f）
         *  [a-z&&[^bc]]（除了bc） 也可以写成[ad-z]
         *
         *  预定义字符类
         *  \d数字
         *  \D非数字
         *  \s空白字符
         *  \S非空白字符
         *  \w单词字符
         *  \W非单词字符
         *
         *  前面多加一个\ 表示转义字符
         *
         *  X?X 一次或者一次都没有
         *  X*X 零次或者多次
         *  X+X 一次或者多次
         *  X{n} 恰好n次
         *  X{n,} 至少n次
         *  X{n,m} 至少n次，但是不超过m次
         *
         *
         *
         */

        //正则表达式的分割方法 -- split

        String s = "12 5 11";
        String[] arr = s.split(" ");

        //替换功能 -- replaceAll

        String sss = "wo1ai2heima";
        String regexSSS = "\\d";

        String sss2 = sss.replaceAll(regexSSS," ");
        System.out.println(sss2);


        //分组功能 -- 前面第一组字符重复出现一次
        String regexSS2 = "(.)\\1(.)\\2";

        String splitStr = "asqqasabbbdqwrqmmmmqwr";
        String regexSS3 = "(.)\\1+";//重复出现1次或者多次的字符
        String[] arrsplit = splitStr.split(regexSS3);
        for (String c:arrsplit
             ) {
            System.out.println(c);
        }

        //去掉. -- \\.（记得转义字符）
        //$1第一组中的内容





    }

}
