package com.map;

import java.util.Objects;

/**
 * Created by songyang on 2019/4/5.
 */
public class HashMapObj {

    private String name;
    private Integer age;

    public HashMapObj() {}

    @Override
    public String toString() {
        return "HashMapObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public HashMapObj(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashMapObj)) return false;
        HashMapObj that = (HashMapObj) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
