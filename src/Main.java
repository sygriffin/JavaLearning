import javax.print.DocFlavor;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int age = 10;
        age += 10;
        System.out.println(age);

        char c = '中';

        System.out.println(c);


        boolean compare = false;
        System.out.println(compare);
        compare = true;
        System.out.println(compare);
        if (compare) {
            System.out.println(1);
        } else  {
            System.out.println(0);
        }

//        String astr = "你好，";
//        String bStr = "Java";

        String cStr = "JAVA" + "Hello";
        System.out.println(cStr);

        int i = 5;
        int j = 5;
        int k = i++ + j;
        i = 5;
        j = 5;
        int l = ++i + j;
        System.out.println(k);
        System.out.println(l);

        STATUS status;
        int result = 74;
        if (result >= 0 && result < 60){
            status = STATUS.STATUS_cha;
            System.out.println(status);
        } else if (result >= 60 && result < 70){
            status = STATUS.STATUS_zhong;
            System.out.println(status);
        } else if (result >= 70 && result < 85){
            status = STATUS.STATUS_liang;
            System.out.println(status);
        } else if (result >= 85 && result < 100){
            status = STATUS.STATUS_you;
            System.out.println(status);
        } else {

        }



        for (int z = 0; z< 10 ; z++) {
            System.out.println(z);
        }


        int x = 0;
        while (x<10) {

            System.out.println(x++);
        }

        Dog dog = new Dog();

        dog.bark();


        A classA = new A("aaa");
        A classA1 = new A();
        classA.funA();
        classA.funA(6);


    }

    public enum STATUS {
        STATUS_you,STATUS_liang,STATUS_zhong,STATUS_cha
    }


    static class Dog {
        //如果一个方法中有与成员变量同名的局部变量，则方法中访问的是局部变量，而不是成员变量
        public String color;
        String name;
        Integer age;
        void bark (){
            System.out.println("wang wang");
        }
    }

}

class A {

    String name;

    A() {}


    A(String aName){
        name = aName;
    }

    void  funA() {
        System.out.println("empty func");
    }

    void funA(int i) {
        System.out.println(i);
    }
}

class Person {
    String name;

    void talk() {
        System.out.println("My name is " + name);
    }
}
