package com.basic;

import com.sy.Person;

import java.util.ArrayList;
//import static java.util.Arrays.sort;
import java.util.Arrays;
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


        Tool<Teacher> t = new Tool<>();//创建工具类对象
        t.setObj(new Teacher("zhangsan",23));

//        Worker w = (Worker) t.getObj();//向下转型
//        System.out.println(w);
        //类型转换错误

        Tool<String> t1 = new Tool<>();
        t1.show("abc");

        //泛型应用在接口上 --


        //泛型通配符 -- <?>
        // -- ? extends E
        //右边的泛型为不确定时，左边可以指定为？
        List<?> list1 = new ArrayList<String>();
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("zhangsan",23));
        list2.add(new Person("lisi",24));
        list2.add(new Person("wangwu",25));

        ArrayList<Teacher> list3 = new ArrayList<>();
        list3.add(new Teacher("zhaoliu",26));
        list3.add(new Teacher("zhouqi",28));
        //
//        list3.addAll(list2);

        //向下限定 -- 子类数组向父类数组添加，全部都会类型提升，但是反过来就不可以了（就是父类->子类）
        list2.addAll(list3);
        System.out.println(list2);
        //打印出来的均为Person对象

        //增强for循环for each -- 类比OC，Swift中的forin
        //简化遍历 -- 底层是由迭代器实现的

        //for循环通过索引删除、迭代器用自身的remove方法删除（并发修改异常），for each 不能删除！！！

        ///静态导入 -- 导入类中的静态方法


        int[] arr = {22,44,11,55,77};
//        Arrays.sort(arr);
        Arrays.sort(arr);//静态导入 -- 类方法调用前缀可以省略掉 --- 这种方法不好，有时会引起歧义与冲突







    }

}

interface Inter<T> {
    public void show(T t);

}

//推荐使用这种方式
class Demo implements Inter<String> {

    @Override
    public void show(String t) {
        System.out.println(t);
    }
}

//没必要在实现接口的时候给自己的类加泛型
//class Demo<T> implements Inter<T> {
//
//    @Override
//    public void show(T t) {
//        System.out.println(t);
//    }
//}