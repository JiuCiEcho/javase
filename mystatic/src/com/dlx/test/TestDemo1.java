package com.dlx.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TestDemo1 {
    /*
    首尾交替
     */
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String name = scanner.next();
            // 初始化队列中的数据
            deque.offerLast(name);
        }

        int count=0;
        while(true){
            if(count%2==0){
                System.out.println(deque.pollFirst());
                count++;
            }else if(count!=5){
                System.out.println(deque.pollLast());
                count++;
            }else{
                return;
            }
        }

    }
}
