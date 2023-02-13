package com.dlx.test;

import java.util.Scanner;

public class TestDemo16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        int n =scanner.nextInt();


        //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
        float flag=h;
        float sum=0;
        while(true){
            if(h==flag){
                sum+=h;
            }else{
                sum+=h*2;
            }
            h=(float)(h*1.0)/2;
            n--;
            if(n==0){
                break;
            }
        }
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
    }
}
