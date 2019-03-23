package com.scanner;

import java.util.Scanner;

/**
 * Created by songyang on 2019/3/12.
 */
public class Scanf {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);



        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println(i);

        }else {
            System.out.println("输入类型错误");
        }

        //nextLine() -- 获取多个Int和String值的情况

        //nextLine() -- 获取一行



        sc.close();

        Scanner sc1 = new Scanner(System.in);










    }
}
