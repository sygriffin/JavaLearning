/**
 * Created by songyang on 2018/12/5.
 * 包和访问权限
 */

//将类放到某个包中

package org.mars;

import mars.DaRen;

public class Class3 {


    //软件包 -- 重名了怎么办 -- 放在不同的文件夹下面

    //此时类的全称为 mars.Class3

    //包名应该怎么取 -- 包名要小写、一般情况下是域名倒过来写（类似BundleID）、.符号代表下一级目录

    //权限 -- public private default protected

    //public -- 文件名和类名必须统一 （两个类不在同一个包中）外部调用

    //private -- 能修饰变量和函数 （变量在对象外部无法访问）

    //default -- 不指定访问权限时（包级别访问限制）

    //protected 以及，继承的问题（只能修饰成员变量成员函数）（子类和父类在不同的包中，可继承成员变量，使用protected，仅有子类可以访问使用继承成员变量，不同于public）

    //protected -- （让成员变量成为你专有并且可以跨包访问的）

    //访问权限与继承

    public static void main(String[] args) {


        Number value = 1.023;

        System.out.println(Math.abs(value.floatValue()));

        System.out.println(value.toString());

        //熟悉Java的各种库以及函数调用

        DaRen daren = new DaRen();

        daren.eat();

    }





}


