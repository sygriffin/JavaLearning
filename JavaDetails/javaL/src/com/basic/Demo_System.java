package com.basic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by songyang on 2019/3/23.
 */
public class Demo_System {

    public static void main (String[] args) {

        //System -- gc 辣鸡回收器
        System.gc();

        //exit 终止当前jvm

        //返回毫秒
        System.currentTimeMillis();

        int[] arr = {1,3,5,6};

        int[] arr2 = new int[8];
        //原数组，原数组中的起始位置，目标数组，目标数组中的起始位置，要复制的数组元素数量（所有参数解释）
        System.arraycopy(arr,0,arr2,0,4);

        //集合底层是由数组实现的

        //BigInteger
        BigInteger bi1 = new BigInteger("1000");
        BigInteger bi2 = new BigInteger("20");
        System.out.println(bi1);

        BigInteger[] arrB = bi1.divideAndRemainder(bi2); //取除数和余数


        //BigDecimal -- 精确存储小数
//        BigDecimal bd1 = new BigDecimal(2.0);
//        BigDecimal bd2 = new BigDecimal(1.1);


        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.1");

        BigDecimal bd3 = BigDecimal.valueOf(0.23);

        System.out.println(bd1.subtract(bd2));

        //入参为double的构造方法计算出来的值具有一定的不确定性 - 0.1无法准确的表示double，所以通常建议优先使用String构造方法
        //一定是double的话，先toString，或者BigDecimal的valueOf
        //以上方法 -- 推荐

        //日期类
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());//均为毫秒级的

        Date date1 = new Date(0);
        System.out.println(date1);
        //构造方法 -- 0 ，类似dateSince1970
        //1970-01-01

        //毫秒级 -- 1s
        Date date2 = new Date();
        date2.setTime(1000);
        System.out.println(date2);

        





















































































































    }

}