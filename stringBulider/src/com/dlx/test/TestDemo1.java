package com.dlx.test;

public class TestDemo1 {
    /*
    字符串反转
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        String str="121221";

        if (sb.append(str).reverse().toString().equals(str)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
