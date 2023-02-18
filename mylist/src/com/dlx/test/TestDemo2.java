package com.dlx.test;

import java.util.ArrayList;

public class TestDemo2 {
    /*
    添加数字并进行遍历
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println("]");
    }
}
