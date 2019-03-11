/**
 * NoNameInnerClass
 */
public class NoNameInnerClass {

    public static void main(String[] args) {
        
        PersonDemo pd = new PersonDemo();

        pd.method(new Person() { //匿名内部类当做参数传递
            public void show() {
                System.out.println("show");
            }
        });

    }
    
}

abstract class Person {

    public abstract void show();

}

class PersonDemo {

    

    public void method(Person p) {
        p.show();
    }
}