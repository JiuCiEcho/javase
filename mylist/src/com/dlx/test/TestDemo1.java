package com.dlx.test;

import java.util.ArrayList;

public class TestDemo1 {
    /*
    集合的增加
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i!=(list.size()-1)){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println("]");
    }
}
