package com.string;

/**
 * Created by songyang on 2019/3/12.
 */
public class String_Method {

    public static void main (String[] args) {

        String s1 = "heimaheima";
        String s2 = "HeiMa";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contains("he"));
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("b"));
        System.out.println(s1.isEmpty());

        //""与null区别 -- 一个是字符串常量，一个是空常量，不可以调用任何方法

        /*
        if ("heima".equals(s1)) {
            System.out.println("111");
        }

        if (s1.equals("heima")) {
            System.out.println("222");
        }

        java中这两中写法究竟有什么区别？？？

        为什么常量放在前 -- 因为字符串有可能为空（出现空指针异常）
        objc中不存在这种异常

        所以java中都是将变量当做方法参数传递 -- 防止空指针异常




        */

        //继续String类的方法
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(s1.length());

        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("m"));
//        System.out.println(s1.indexOf(92,1));///传Unicode
        System.out.println(s1.indexOf("a",3));///从3的位置往后找，出现的第一个a
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(s1.lastIndexOf('m'));//从后向前找，第一次出现的字符
        System.out.println("++++++++++++++++++++++++++++");//
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,5));


        //字符串遍历，for循环||charAt()
        
        String s5 = "ABCDEfjHijk123456!@#$%";

//        for (int i = 0; i < s5.length(); i++) {
//
//        }
//
        int count = 0;
        for (char i:s5.toCharArray()) {

            if (i >= 'A' && i<='Z') {
                System.out.println(i);
                count ++;
            }

        }

        System.out.println(count);


        //注意getBytes() 与 GBK码表



        String trans_str = String.valueOf(123);
        System.out.println(trans_str);

        char[] arr1 = {'a','b','c'};

        String trans1_str = new String(arr1);

        String trans2_str = String.valueOf(arr1);

        System.out.println(trans1_str.concat(trans2_str));

        String demo1 = "asdqwHAUSDSdqw";

        String demo1_result =
                demo1
                .substring(0,1)
                .toUpperCase()
                .concat(demo1
                        .substring(1,demo1.length())
                        .toLowerCase());

        System.out.println(demo1_result);

//        int arr_num [] = {1,2,3};

        String demo3_str = " asd asda awfsdqw ";
        System.out.println(demo3_str);
        System.out.println(demo3_str.trim());//去除首尾空格


        String demo4_str = "a";
        String demo5_str = "aaaa";//按照码表值进行比较

        int num = demo4_str.compareTo(demo5_str);
        System.out.println(num);

        System.out.println('黑' + 0);
        System.out.println('马' + 0);

        String he = "黑";
        String ma = "马";

        int num3 = he.compareTo(ma);
        System.out.println(num3);//查的是Unicode编码表

        String s6 = "heima";
        String s7 = "HEIMA";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareToIgnoreCase(s7));

        String abc  = "abc";
//        char [] newChar;
//        for (char i : abc.toCharArray()
//             ) {
//            System.out.println(i);
//
//        }

        String cartStr = "woaiheima,heimabutongyubaima,wulunheimahaishibaima";
        String cart_min_Str = "heima";

        int countValue = 0;
        int countIndex = 0;


        //split -- 字符串截取
        int index = cartStr.indexOf("heima");

        System.out.println(index);

        while ((countIndex = cartStr.indexOf(cart_min_Str)) != -1) {
            countValue ++;
            cartStr = cartStr.substring(countIndex + 5);
        }

        System.out.println(countValue);

//        StringBuffer -- 线程安全的，可变的字符序列，不可以用+






    }
}
