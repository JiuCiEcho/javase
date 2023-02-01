package com.dlx.test;

import java.util.Scanner;

public class TestDemo5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base1 obj = (Base1) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    public static String getClassName(Base1 obj) {

        //write your code here......
        return obj.getClass().getName();

    }

}

class Base1 {

}

class Sub1 extends Base1 {

}

class Sub2 extends Base1 {

}

