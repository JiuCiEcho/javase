package com.dlx.test;

public class TestDemo7 {
    /*
    testdemo6的case2
     */
    public static void main(String[] args) {
        /*
        定义两个字符串
         */
        String strA="abcde";
        String strB="bcdea";

        System.out.println(check(strA,strB));

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

    private static String rotate(String strA) {
        char[] arr=strA.toCharArray();
        char first=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        return new String(arr);
    }
}
