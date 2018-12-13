/**
 * Created by songyang on 2018/12/4.
 */

package mars;

public class Class2 {


    public static void main(String[] args) {

        //此时Ren无法实例化 -- 抽象类不能生成对象

        DaRen daren = new DaRen();
        daren.name = "haoqi";
        daren.age = 22;
        daren.eat();
        daren.introduce();

    }

    //抽象函数 -- 只有函数定义，没有函数体


}

//拥有抽象函数的一定是抽象类(天生用来被继承的)
abstract class Ren {
    String name;
    int age;

    Ren() {
        System.out.println("11111");
    }

    void introduce(){
        System.out.println("name "+name+"\nage "+age);
    }

    abstract void eat();
}




