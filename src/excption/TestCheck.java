package excption;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by songyang on 2018/12/13.
 */
public class TestCheck {
    public static void main(String[] args) {

        ///check exception -- RuntimeException及其子类

        //必须进行异常处理

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //
        finally {
            System.out.println("异常出口");

            //保证程序完整性 -- try里面可能没执行完的就到了Catch
        }

        //throw（抛出）和throws（声明）
        //考验功底 -- 什么时候该抛出异常

        User user = new User();


        try {
            user.setAge(-20);
        } catch (Exception e) {
            e.printStackTrace();
        }





    }

}
