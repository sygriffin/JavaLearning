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
        byte [] buffer = new byte[1024];

        //从文件读数据
        try {

            fis = new FileInputStream("/Users/songyang/Desktop/github/JavaLearning/1.txt");
            fos = new FileOutputStream("/Users/songyang/Desktop/github/JavaLearning/2.txt");

            //返回读取的字节数


            while (true) {
                int temp = fis.read(buffer,0,buffer.length);
                if (temp == -1) {
                    break;
                }
                fos.write(buffer,0,temp);
            }

//            for (int i = 0; i < buffer.length; i++){
//                System.out.println(buffer[i]);
//                //读出来的是ASCII码 --
//            }


            String s = new String(buffer);
            s = s.trim();//去掉首尾空格和空字符
            System.out.println(s);



        } catch ( Exception e){
            System.out.println(e);
        }
        //关闭也要捕获异常
        finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        //字符流：读写文件时，以字符为基准FileReader，FileWriter

        FileReader fr = null;
        FileWriter fw = null;
        char bufferC [] = new char[1024];

        try {

            fr = new FileReader("/Users/songyang/Desktop/github/JavaLearning/1.txt");
            fw = new FileWriter("/Users/songyang/Desktop/github/JavaLearning/2.txt");



//            for (int i = 0; i < bufferC.length; i++){
//                System.out.println(bufferC[i]);
//            }
//            fw.write(bufferC,0,temp);
            //大文件读写
            while (true) {
                int temp = fr.read(bufferC,0,bufferC.length);
                if(temp == -1){
                    break;
                }
                fw.write(bufferC,0,temp);
            }

        } catch ( Exception e){
            System.out.println(e);
        }


        finally {
            try {
                fr.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        //节点流与处理流的关系与使用实例

        //处理流 -- BufferedReader （字符输入处理流）
        //readLine() -- 一次读取一行数据 --- /Users/songyang/Desktop/msg.txt

        //如何生成BufferedReader对象 -- 接受Reader类型的对象


        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("/Users/songyang/Desktop/github/JavaLearning/msg.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }


        //装饰者设计模式














    }

}
