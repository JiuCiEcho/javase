package com.dlx.test;

import com.dlx.bean.Phone;

public class PhoneTest {
    /*
    需求：存储三部手机，计算平均价格
     */
    public static void main(String[] args) {
        Phone[] phones=new Phone[3];

        Phone p1=new Phone("华为",4999.0,"黑色");
        Phone p2=new Phone("小米",1999.0,"黑色");
        Phone p3=new Phone("荣耀",2999.0,"黑色");

        phones[0]=p1;
        phones[1]=p2;
        phones[2]=p3;

        double sum=0;
        for (int i = 0; i < phones.length; i++) {
            sum+=phones[i].getMoney();
        }

        System.out.println("三部手机的平均价格是："+sum/ phones.length);

    }

}
