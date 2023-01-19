package com.dlx.test;

import com.dlx.bean.Good;

public class GoodTest {
    /*
    需求:创建一个数组存放商品，并进行遍历
     */
    public static void main(String[] args) {
        //创建商品数组
        Good[] goods=new Good[3];

        //创建商品对象
        goods[0]=new Good("001","华为手机",100);
        goods[1]=new Good("002","保温杯",50);
        goods[2]=new Good("003","充电线",20);

        //遍历
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].toString());
        }
    }
}
