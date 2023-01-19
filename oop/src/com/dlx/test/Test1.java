package com.dlx.test;

import com.dlx.bean.Role;

public class Test1 {
    /*
    需求：文字版回合制游戏
     */
    public static void main(String[] args) {
        Role r1=new Role("张三",100);

        Role r2=new Role("李四",100);

        while (true){
            //开始攻击
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;//结束游戏
            }

            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }
        }
    }
}
