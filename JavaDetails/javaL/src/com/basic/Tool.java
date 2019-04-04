package com.basic;

/**
 * Created by songyang on 2019/3/25.
 */
public class Tool<T> {

    private T t;

    public T getObj() {
        return t;
    }

    public void setObj(T t) {
        this.t = t;
    }

//    public void show (T t) {//方法泛型与类的泛型一致
//        System.out.println(t);
//    }

    public <Q>void show (Q q) {
        System.out.println(q);
    }

    public static <T>void print(T t) {//静态方法随着类的加载而加载，必须生成自己的泛型

        //这个泛型和类本身，并不一样
        System.out.println(t);


    }

}
