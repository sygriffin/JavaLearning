package com.sy;

import java.util.Objects;

/**
 * Created by songyang on 2019/4/1.
 */
public class Person implements Comparable<Person>{



    private String name;
    private int age;
    public Person(){
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        Person p = (Person)obj;
//        return this.name.equals(p.name)&&this.age == p.age;
//    }

//    @Override
//    public int hashCode() {
//        //如何处理hash碰撞
//        final  int NUM = 38;
//        return name.hashCode() * NUM + age;
//
//    }


    //系统生成处理hash碰撞
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //系统会帮我们生成HashCode和equals方法

    //31 -- 质数（本质上都是处理HashSet）
    //2的五次方-1，2向左移动五位减1


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person o) {
        //如何对比的 -- 返回的值？//仍然存在碰撞的问题
        int num = this.age - o.age;
        return num == 0?this.name.compareTo(o.name):num;

    }

    //健壮性判断 --



}
