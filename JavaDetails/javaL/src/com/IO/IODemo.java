package com.IO;

import java.io.*;


/**
 * Created by songyang on 2019/4/12.
 */
public class IODemo {

    public static void main (String[] args) throws IOException {

        //字节流输入 -- 读进来
//        demo1();
        //字节输出流 -- 写出去：写到文件里去;没有文件就创建一个
//        demo2();
        //图片、MP3都可以直接拷贝

        //标准的小数组读取
//        demo5();

        //BufferInputStream 与 BufferOutputStream
//        demo6();
        //flush 与 close
//        demo7();
        //字节流读取中文的问题
        //中文字符占位及乱码问题 -- 写出中文：getBytes()
//        demo8();
        //标准的IO流异常处理1.7
//        demo9();

        //字符流 读与写
//        demo10();
        //copy -- 不推荐使用 -- 耗费性能 -- 不可以copy非纯文本文件
        //BufferedReader与BufferedWriter
//        demo11();
        //readLine -- 按行读取  newLine换行符

        //LineNumberReader -- 行号

        //Java - 设计模式：Java中的设计模式用到的远比iOS的多

        //用指定的码表转换 -- 指定码表
//        demo12();


        //序列流 -- SequenceInputStream（整合序列流 -- 合并）-> 多个序列流的整合，用Vector的enumeration

//        demo13();





    }

    private static void demo13() throws IOException {
        FileInputStream fis1 = new FileInputStream("aaa.txt");
        FileInputStream fis2 = new FileInputStream("bbb.txt");

        FileOutputStream fos = new FileOutputStream("ddd.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(fis1,fis2);

        int b;
        while ((b = sequenceInputStream.read()) != -1) {
            fos.write(b);
        }
        sequenceInputStream.close();
        fos.close();
    }

    private static void demo12() throws UnsupportedEncodingException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("UTF-8.txt"),"UTF-8"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("GBK.txt"),"GBK"));
    }

    private static void demo11() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("ccc.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("bbb.txt"));

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }

        reader.close();
        writer.close();
    }

    private static void demo10() throws IOException {
        FileReader reader = new FileReader("ccc.txt");
        int x = reader.read();
        System.out.println(x);

        char c = (char)x;
        System.out.println(c);
        reader.close();


        FileWriter writer = new FileWriter("bbb.txt");
        writer.write("你好你好你好");
        writer.close();
    }

    private static void demo9() throws IOException {
        try (
                FileInputStream fis = new FileInputStream("aaa.txt");
                FileOutputStream fos = new FileOutputStream("bbb.txt");
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

        }
    }

    private static void demo8() throws IOException {
        FileOutputStream fos = new FileOutputStream("bbb.txt");
        fos.write("你好你好".getBytes());
        fos.close();
    }

    private static void demo7() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileOutputStream fos = new FileOutputStream("ddd.txt");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        int b;
        while ((b = bfis.read()) != -1) {
            bfos.write(b);
        }
        bfis.close();
        bfos.close();
        //忘记关流了！-- 文件变小了
        //close ： 具备刷新功能 - 将缓冲区的字节全部都刷新到文件上，再关闭
        //flush ： flush -- 不是每次写都必须要刷 -- 实时刷新就可以应用
    }

    private static void demo6() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileOutputStream fos = new FileOutputStream("ccc.txt");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        int b;
        while ((b = bfis.read()) != -1) {
            bfos.write(b);
        }
        bfis.close();
        bfos.close();
    }

    private static void demo5() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileOutputStream fos = new FileOutputStream("bbb.txt");

        byte[] arr = new byte[1024*8];
        int length;
        while ((length = fis.read(arr)) != -1){
            fos.write(arr,0,length);
        }

        fis.close();
        fos.close();
    }

    private static void demo2() throws IOException {
        //会覆盖文件原来的数据

        //文件名后 -- true！追加写入
        FileOutputStream fileOutputStream = new FileOutputStream("aaa.txt",true);


        fileOutputStream.write(99);
        fileOutputStream.write(98);
        fileOutputStream.write(97);

        fileOutputStream.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("aaa.txt");
        int x = fileInputStream.read();
        System.out.println(x);//读取的是ASSIC
        int y = fileInputStream.read();
        System.out.println(y);//继续向下读一个字节
        fileInputStream.close();
        //文件结束标志为-1，意味着往下没有字节了
    }

}
