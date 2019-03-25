package com.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songyang on 2019/3/25.
 */
public class Demo_Generic {

    public static void main(String [] args) {

        //看看Java中的泛型

        //class cast exception -- 类型转换异常
        //本质上和Swift上的泛型概念没有任何区别
        //把错误预警提升到了编译状态而不是运行状态

        //泛型一般不定义成object，没有任何意义

        ArrayList<String> list = new ArrayList<>();//创建集合对象

        Iterator<String> it = list.iterator();




    }

}
