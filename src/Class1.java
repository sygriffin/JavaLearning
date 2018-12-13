
/**
 * Created by songyang on 2018/11/29.
 */
import org.mars.Class3;

public class Class1 {

    public static void main(String[] args) {

        System.out.println("=======向上转型=======");

        //向上转型 -- 将子类的对象赋值给父类的引用
        Student stu1 = new Student();

        Person per1 = stu1;

        per1.name = "zhao6";
        per1.age = 18;
        per1.address = "dili";

//        per1.score = "11";

        //引用能调用哪些成员取决于引用的类型

        per1.talk();//执行的是student

        //向上转型这种写法也可以
//        Person per2 = new Student();


        System.out.println("=======向下转型=======");
        //前提 -- 首先进行向上转型

        //再进行向下转型（强制转换）
        Student stu2 = (Student)per1;

        int flag = 0;

        if (flag == 0) {
            CannonPrinter printer = new CannonPrinter();
            printer.open();
            printer.print("abc");
            printer.close();
        } else {
            Printer printer = new Printer();
            printer.open();
            printer.print("abc");
            printer.close();
        }

        Class3 cl3 = new Class3();




    }
}


class Printer {
    void open() {
        System.out.println("=======open=======");
    }

    void close() {
        System.out.println("=======close=======");
    }

    void print(String str) {
        System.out.println("=======print======="+str);
    }



}

class CannonPrinter extends Printer {

    @Override
    void close() {
        this.clean();
        super.close();
    }

    void  clean() {
        System.out.println("=======clean=======");
    }

}

//利用抽象类排除错误
class HPPrinter extends Printer {

}
