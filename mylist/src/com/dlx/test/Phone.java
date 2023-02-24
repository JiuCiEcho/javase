package com.dlx.test;

public class Phone {
    /*
    手机javabean
     */
    private String name;
    private Double price;

    public Phone() {
    }

    public Phone(String name, Double price) {
        this.name = name;
        this.price = price;
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
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{name = " + name + ", price = " + price + "}";
    }
}
