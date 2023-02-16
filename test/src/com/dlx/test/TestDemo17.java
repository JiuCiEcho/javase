package com.dlx.test;

import java.util.Scanner;

public class TestDemo17 {
    /*
    四舍五入
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();

        int e=(int)d;
        if(d-e>0.5){
            System.out.println(e+1);
        }else{
            System.out.println(e);
        }
    }
}
