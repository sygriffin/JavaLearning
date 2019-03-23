package com.sy;

/**
 * Created by songyang on 2019/3/11.
 */
public class HashCode {

    public static void main (String[] args) {
        Object obj1 = new Object();

        int hashCode = obj1.hashCode();

        System.out.println(hashCode);

        System.out.println(obj1.getClass().getName());

        Integer a = 6;

        final String s = a.toString();

        final Class<? extends String> aClass = s.getClass();

        System.out.println(aClass);

        //toString -- 更方便显示属性值

        //直接打印对象引用 -- 会默认调用toString


        Student st1 = new Student("zhangsan",16);

        System.out.println(st1.getName() + " " + st1.getAge());
        System.out.println(st1.hashCode());

        Student st2 = new Student("zhangsan",16);
        System.out.println(st2.hashCode());

        System.out.println(st1.equals(st2));
        System.out.println(st1 == st2);
        //equals是比较对象地址值的，没有什么意义，需要重写
        //比较对象中的属性值，认为相等属性即为同一个对象

        //== 与 equals 区别 ： ==比较基本数据类型也可以比较引用类型（基本类型比较值，引用数据类型比较地址值）
        //equals没重写之前比较的是地址值底层依赖的是==，需要重写，比较对象中的属性值








    }


}