package com.dlx.test;

import java.util.Scanner;

public class TestDemo10 {
    /*
    输入两个字符串类型的非负整数，并返回乘积
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第一个字符串类型的非负整数：");
        String strA=sc.next();
        System.out.print("请输入第二个字符串类型的非负整数：");
        String strB=sc.next();
        /*
        定义一个函数，求出他们的乘值
         */
        System.out.println("两数相乘的积为："+ji(strA,strB));

    }

    private static int ji(String strA, String strB) {

        /*
        定义一个函数分别返回他们的真实值
         */
        return ge(strA)*ge(strB);
    }

    private static int ge(String s) {
        char[] chs=s.toCharArray();
        int sum=0;
        for (int i = 0; i < chs.length; i++) {
            sum=(chs[i]-'0')+sum*10;
        }
        return sum;
    }
}
