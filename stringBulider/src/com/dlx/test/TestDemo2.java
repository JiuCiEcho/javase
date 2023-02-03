package com.dlx.test;

public class TestDemo2 {
    /*
    字符串拼接
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        int[] arr=new int[]{1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
