package com.dlx.test;

import java.util.Scanner;

public class ImplDemo1 {
    /*
    接口实现
     */
    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }
}
interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

class ComparatorImpl implements Comparator{
    public int max(int x,int y){
        return x>y?x:y;
    }
}
