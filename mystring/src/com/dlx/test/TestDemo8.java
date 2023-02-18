package com.dlx.test;

import java.util.Random;
import java.util.Scanner;

public class TestDemo8 {
    /*
    任意输入一个字符串，打乱里面的顺序
     */
    public static void main(String[] args) {
        /*
        思路：将一个任意的字符串用方法转换成字符数组之后生成随机数来打乱顺序
         */
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str=sc.next();
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int seed=r.nextInt(arr.length-1);
            int temp=arr[i];
            arr[i]=arr[seed];
            arr[seed]=(char)temp;
        }
        /*
        打印交换后的字符串
         */
        System.out.println(new String(arr));
    }
}
