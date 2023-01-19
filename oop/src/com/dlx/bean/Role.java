package com.dlx.bean;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role r){

        Random random=new Random();
        int hurt=random.nextInt(20)+1;

        int remainBlood=r.getBlood()-hurt;

        remainBlood=remainBlood < 0 ? 0:remainBlood;

        r.setBlood(remainBlood);

        System.out.println(this.name+"举起拳头，打了"+r.name+"一下，"+"造成了"+hurt+"点伤害，"+r.name+"还剩"+remainBlood+"滴血");
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
}
