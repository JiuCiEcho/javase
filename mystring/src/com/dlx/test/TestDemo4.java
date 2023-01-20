package com.dlx.test;

public class TestDemo4 {
    /*
    字符串倒转输出
     */
    public static void main(String[] args) {
        String str="abc";
        System.out.println("字符串为："+str);
        String str1=reserve(str);
        System.out.println("字符串为："+str1);
    }

    private static String reserve(String str) {
        char[] chs=new char[str.length()];

        for (int i = str.length()-1; i >=0; i--) {
            chs[str.length()-i-1]=str.charAt(i);
        }

        String newArr=new String(chs);
        return newArr;
    }
}
