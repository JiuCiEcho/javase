package com.dlx.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo4 {
    public static void main(String[] args) {
        /*
        添加手机对象，返回价格低于3000的手机
         */
        Scanner sc=new Scanner(System.in);
        ArrayList<Phone> list=new ArrayList<>();
        /*
        循环添加手机对象
         */
        for (int i = 0; i < 3; i++) {
            Phone p=new Phone();
            System.out.print("请输入当前的手机名称:");
            String name=sc.next();
            System.out.print("请输入当前手机的价格:");
            double price=sc.nextDouble();
            p.setName(name);
            p.setPrice(price);
            list.add(p);
        }
        /*
        循环遍历手机价格
         */
        for (int i = 0; i < list.size(); i++) {
             double price=list.get(i).getPrice();
             if(price<3000){
                 System.out.println(list.get(i).toString());
             }
        }
    }
}
