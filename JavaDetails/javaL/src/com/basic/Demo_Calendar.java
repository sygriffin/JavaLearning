package com.basic;

import java.util.Calendar;

/**
 * Created by songyang on 2019/3/25.
 */
public class Demo_Calendar {

    public static void main (String[] args) {

        Calendar currentCal = Calendar.getInstance();
        System.out.println(currentCal.get(Calendar.YEAR));
        System.out.println(Calendar.YEAR);
        System.out.println(currentCal.get(Calendar.MONTH));//注意，月是从0开始编号的
        System.out.println(currentCal.get(Calendar.DAY_OF_MONTH));
        System.out.println(currentCal.get(Calendar.DAY_OF_WEEK));//从周日为第一天开始计算
        System.out.println(currentCal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //add() 与 set()


        //对年份进行加减（对指定进行加减）
        currentCal.add(Calendar.YEAR,1);
        System.out.println(currentCal.get(Calendar.YEAR));
        //设定某个值
        currentCal.set(Calendar.YEAR,2013);
        System.out.println(currentCal.get(Calendar.YEAR));


        currentCal.isLenient();



    }

    //传入单位数前面补0
    public static String getNum(int num) {

        return num > 9? ""+num : "0"+num;
    }


}
