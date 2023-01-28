package com.dlx.test;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo {
    /*
    字符串去重
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        HashSet<Character> hs = new HashSet<>();

        //write your code here......
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }

        for (char c:hs) {
            System.out.print(c);
        }
    }
}

