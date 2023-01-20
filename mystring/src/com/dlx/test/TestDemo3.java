package com.dlx.test;

public class TestDemo3 {
    /*
    数组拼接
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ",");
        }
    }
}
