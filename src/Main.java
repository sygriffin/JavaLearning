import javax.annotation.processing.SupportedOptions;import javax.print.DocFlavor;import java.math.BigDecimal;public class Main {    public static void main(String[] args) {        int age = 10;        age += 10;        System.out.println(age);        char c = '中';        System.out.println(c);        boolean compare = false;        System.out.println(compare);        compare = true;        System.out.println(compare);        if (compare) {            System.out.println(1);        } else  {            System.out.println(0);        }//        String astr = "你好，";//        String bStr = "Java";        String cStr = "JAVA" + "Hello";        System.out.println(cStr);        int i = 5;        int j = 5;        int k = i++ + j;        i = 5;        j = 5;        int l = ++i + j;        System.out.println(k);        System.out.println(l);        STATUS status;        int result = 74;        if (result >= 0 && result < 60){            status = STATUS.STATUS_cha;            System.out.println(status);        } else if (result >= 60 && result < 70){            status = STATUS.STATUS_zhong;            System.out.println(status);        } else if (result >= 70 && result < 85){            status = STATUS.STATUS_liang;            System.out.println(status);        } else if (result >= 85 && result < 100){            status = STATUS.STATUS_you;            System.out.println(status);        } else {        }        for (int z = 0; z< 10 ; z++) {            System.out.println(z);        }        int x = 0;        while (x<10) {            System.out.println(x++);        }        Dog dog = new Dog();        dog.bark();        A classA = new A("aaa");        A classA1 = new A();        classA.funA();        classA.funA(6);        Person p = new Person();        p.name = "lisi";        p.talk();        Person.i = 6;//static静态成员变量可以使用类名调用, 生成的person对象会公用这个成员变量        Person q = new Person();        System.out.println(Person.i);        Person.fun();        Student student = new Student();        student.name = "zhangsan1";        student.age = 17;        student.eat();        Student student2 = new Student("wangwu1",14,4);        Class1 classType = new Class1();        BigDecimal a = BigDecimal.valueOf(100);        student2.eat();        student2.talk();        p.eat();        /*****************************************************************/        //特殊的抽象类        //面向对象的多态性        USBPhone phone = new USBPhone();        USB usb = phone;        usb.USBread();        usb.USBwrite();        WiFi wifi = phone;        wifi.openWifi();        wifi.closeWifi();    }    public enum STATUS {        STATUS_you,STATUS_liang,STATUS_zhong,STATUS_cha    }    static class Dog {        //如果一个方法中有与成员变量同名的局部变量，则方法中访问的是局部变量，而不是成员变量        public String color;        String name;        Integer age;        void bark (){            System.out.println("wang wang");        }    }}class A {    String name;    A() {}    A(String aName){        name = aName;    }    void funA() {        System.out.println("empty func");    }    void funA(int i) {        System.out.println(i);    }}//this 关键字(对象本身，相当于OC-self)class Person {    String name;    int age;    String address;    Person() {    }    Person(String name , int age) {        this();        this.name = name;        this.age  = age;    }    Person(String name , int age, String address) {        //直接调用本类中的构造函数，this这条语句必须在第一句        this(name, age);        this.address = address;    }    //static关键字    static  int i;    //静态函数    static  void  fun() {//        静态函数中不能引用非静态的，不存在类的对象//        System.out.println("My name is " + this.name);        System.out.println("静态函数");    }    void talk() {        //使用成员变量使用this，不然默认为传入参数        System.out.println("My name is " + this.name);    }    //静态代码块 -- 在装载这个类的时候执行，无需调用，实际上用的也不多    static  {        System.out.println("static block");    }    void eat() {        System.out.println("eat");    }}//继承 -- 优化代码的一种思路//为什么子类中必须调用父类的构造函数，赋值（无法继承构造函数，只能调用）class Student extends Person {    int grade;    String score;    Student() {    }    Student (String name, int age, int grade) {        super(name,age);        this.grade = grade;    }    //Java 不支持多继承    //override 复写    @Override    void talk() {        super.talk();        System.out.println("garde is "+grade);    }    //复写（重写）    @Override    void eat() {//        super.eat();        System.out.println("student eat");    }    void study() {        System.out.println("Student study");    }}