package com.dlx.test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListDemo1 {
    /*
    list集合的遍历
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        scanner.close();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);

        /*
        普通for循环
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        /*
        加强for循环
         */
        for (int i:
        list) {
            System.out.print(i+" ");
        }

        System.out.println();
        /*
        迭代器循环
         */
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
