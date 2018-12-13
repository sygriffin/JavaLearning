package mars;

//抽象类可以有构造函数吗？-- 可以
public class DaRen extends Ren {

    public DaRen() {
        //此处应有super

        System.out.println("22222");
    }

    @Override
    public void eat() {
        System.out.println("da ren");
    }



}
