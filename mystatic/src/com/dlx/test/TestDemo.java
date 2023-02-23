package com.dlx.test;

import static com.dlx.test.ArrUtil.getAerage;
import static com.dlx.test.ArrUtil.printArr;

public class TestDemo {
    /*
    测试类
     */
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        double[] arr2={1.0,2.0,3.0,4.0,5.0};
        System.out.println(printArr(arr1));
        System.out.println("数组的平均值为："+getAerage(arr2));
    }
}
