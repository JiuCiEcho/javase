package com.dlx.test;

public class TestDemo2 {
    /*
    统计字符串个数
     */
    public static void main(String[] args) {
        String str="ajhdsfjsdu452742";

        //统计个数
        int a=0;
        int b=0;
        int c=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65&&str.charAt(i)<=91){
                a++;
            }else if(str.charAt(i)>=97&&str.charAt(i)<=123){
                b++;
            }else{
                c++;
            }
        }

        System.out.println("大写字母有"+a+"个，小写字母有"+b+"个，数字有"+c+"个");
    }
}
