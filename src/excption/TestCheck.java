package excption;


import java.io.*;

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
            user.setAge(20);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //输入输出I/O -- 对数据进行读写操作

        //数据流stream

        //InputStream
        //OutputStream

        //输入输出流

        FileInputStream fis = null;
        //向文件写数据
        FileOutputStream fos = null;
        byte [] buffer = new byte[100];

        //从文件读数据
        try {
            fis = new FileInputStream("/Users/songyang/Desktop/1.txt");
            fos = new FileOutputStream("/Users/songyang/Desktop/2.txt");
            int temp = fis.read(buffer,0,buffer.length);
//            for (int i = 0; i < buffer.length; i++){
//                System.out.println(buffer[i]);
//                //读出来的是ASCII码 --
//            }

            fos.write(buffer,0,temp);
            String s = new String(buffer);
            s = s.trim();//去掉首尾空格和空字符
            System.out.println(s);

        } catch ( Exception e){
            System.out.println(e);
        }







    }

}
