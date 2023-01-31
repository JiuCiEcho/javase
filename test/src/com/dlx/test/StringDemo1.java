package com.dlx.test;

import java.util.Scanner;

public class StringDemo1 {
    /*
    动态字符串
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder sb=new StringBuilder(str);
        for(int i=str.length()-3;i>=0;i-=3){
            sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
