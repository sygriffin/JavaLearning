package com.sy;

/**
 * Created by songyang on 2019/3/11.
 */
public class Student {



    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Student(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

}
