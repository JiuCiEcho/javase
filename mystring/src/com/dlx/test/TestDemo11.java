package com.dlx.test;

import java.util.Scanner;

public class TestDemo11 {
    /*
    输一个带有空格的字符串，统计最后一个单词的长度
     */
    public static void main(String[] args) {
        /*
        输入任意长度的字符串
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入字符串：");
        String str = sc.next();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        System.out.println("字符串的最后一个单词的长度为：" + count);
    }
}
