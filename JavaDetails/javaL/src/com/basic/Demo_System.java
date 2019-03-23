package com.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

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

















































































































    }

}