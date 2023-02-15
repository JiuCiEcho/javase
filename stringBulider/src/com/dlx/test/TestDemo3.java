package com.dlx.test;

import java.util.Scanner;

public class TestDemo3 {
    /*
    字符串的校验和替换
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=null;
        while (true) {
            System.out.print("请输入一个字符串：");
            str=sc.next();
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("字符串不符合规则，请重新输入~~~");
                continue;
            }
        }

        //字符串替换
        String[] arr={" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};

        //创建stringbuilder对象，进行字符拼接
        StringBuilder sb=new StringBuilder();
        System.out.println("字符替换如下："+replaceStr(sb,str,arr));
    }

    private static String replaceStr(StringBuilder sb,String str,String[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int j=str.charAt(i)-'0';
            sb.append(arr[j]);
        }
        return sb.toString();
    }

    private static boolean checkStr(String str) {
        //长度校验
        if(str.length()>9||str.length()==0){
            return false;
        }
        //内容校验
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                System.out.println("字符串不符合规则(存在其他元素)~~~");
                return false;
            }
        }

        //校验合格
        return true;
    }
}
