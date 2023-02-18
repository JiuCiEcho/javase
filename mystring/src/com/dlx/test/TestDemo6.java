package com.dlx.test;

public class TestDemo6 {
    /*
    给定两个字符串，A和B，若a字符串再反转了若干次后与b相同，则返回true
     */
    public static void main(String[] args) {
        /*
        定义两个字符串
         */
        String StrA="abcde";
        String StrB="cdeab";
        System.out.println(check(StrA,StrB));
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String StrA){
        char first=StrA.charAt(0);
        String end=StrA.substring(1);

        return end+first;
    }
}
