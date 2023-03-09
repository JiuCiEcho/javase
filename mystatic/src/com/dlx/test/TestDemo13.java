package com.dlx.test;

import java.util.Scanner;

public class TestDemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        double heightValue=weight/(height*height);
        if(heightValue>=18.5&&heightValue<20.9){
            System.out.println("苗条");
        }else if(heightValue>=20.9&&heightValue<=24.9){
            System.out.println("适中");
        }else if(heightValue<18.5){
            System.out.println("偏瘦");
        }else{
            System.out.println("偏胖");
        }
    }
}
