package com.File;

import java.io.*;

/**
 * Created by songyang on 2019/4/11.
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {


        //文件路径或者文件夹路径
//        demo1();

        //文件的创建 -- 若文件存在就不创建了
//        demo2();

        //文件的删除 --
        //删除不走回收站
        //删除文件夹，该文件夹必须为空，不能包含文件或者文件夹
        //
//        demo4();

        //重命名
//        demo3();

        //文件的各种判断功能

        //文件的获取功能

        //FileFilter
        fileFilter();




    }

    private static void fileFilter() {
        File dir = new File("/");
//        File[] subfiles = dir.listFiles();

//        for (File subFile :
//                subfiles) {
//            if (subFile.isFile() && subFile.getName().endsWith(".jpg")){
//                System.out.println(subFile);
//            }
//
//        }

        String[] arr = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //此处是过滤条件 -- return true就可以获取到文件
                return true;
            }
        });

        for (String string :
                arr) {

            System.out.println(string);
        }
    }

    private static void demo4() {
        File file = new File("zzz.txt");

        System.out.println(file.delete());
    }

    private static void demo3() {
        File file1 = new File("yyy.txt");
        File file2 = new File("zzz.txt");
        System.out.println(file1.renameTo(file2));
    }

    private static void demo2() throws IOException {
        File file = new File("yyy.txt");
        System.out.println(file.createNewFile());

        //创建文件夹 --
        File file1 = new File("aaa.txt");
        file1.mkdir();

//        File file3 = new File("ccc\\ddd");
//        file3.mkdirs();


    }

    private static void demo1() throws IOException {

        String filePath = "/Users/songyang/Desktop/github/JavaLearning/JavaDetails/javaL/src/com/File/a.txt";

        FileInputStream fis = new FileInputStream(filePath);

        fis.close();
    }

}
