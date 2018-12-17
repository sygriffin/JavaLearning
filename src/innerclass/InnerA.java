package innerclass;

/**
 * Created by songyang on 2018/12/17.
 */
public class InnerA {
    //内部类 -- 编译出来是InnerA$InnerB
    public int i;

    public class InnerB {

        public int j;

        public int funB() {
            int result = InnerA.this.i + j;
            return result;
        }


    }


}
