package com.dlx.test;

import java.util.StringJoiner;

public class ArrUtil {
    /*
    数组工具类
     */
    private ArrUtil(){

    }

    public static String printArr(int[] arr){
        String result="";
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                result+=arr[i]+",";
            }else{
                result+=arr[i]+"]";
            }
        }
        return result;
    }


    public static double getAerage(double[] arr){
        double d=0.0;
        for (int i = 0; i < arr.length; i++) {
            d+=arr[i];
        }
        return d/(arr.length);
    }

}
