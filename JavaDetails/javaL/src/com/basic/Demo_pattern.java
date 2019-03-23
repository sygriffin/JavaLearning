package com.basic;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by songyang on 2019/3/23.
 */
public class Demo_pattern {

    public static void main(String[] args) {

//        Pattern p = Pattern.compile("a*b");//获取正则表达式
//        Matcher m = p.matcher("aaaab");//获取一个匹配器 返回matcher -- matches 看是否可以匹配，匹配就返回true
//        boolean b = m.matches();
//
//        System.out.println(b);

        ///什么时候会用这些 -- 获取一个串中的手机号与邮箱

        String phoneNum = "adawd13211123223hsudf14371279020sqwe";

        String regexPhone = "[1][34578]\\d{9}";

        Pattern p = Pattern.compile(regexPhone);
        Matcher m = p.matcher(phoneNum);

        ///find方法 -- 必须要先find再获取
//        System.out.println(m.find());
//        String result = m.group();
//        System.out.println(result);

        while (m.find()){
            System.out.println(m.group());
        }

        //Math库
        Math.ceil(12.3);//向上取整
        Math.floor(12.3);//向下取整

        //pow -- 指数函数
        //round -- 四舍五入
        //sqrt -- 开方

        //Random库 -- （没有种子的时候是纳秒值）
        Random r = new Random();
        int x = r.nextInt(100);
        System.out.println(x);
        x = r.nextInt(100);
        System.out.println(x);

        //指定种子 -- 每次运行会生成一样的结果






    }

}
