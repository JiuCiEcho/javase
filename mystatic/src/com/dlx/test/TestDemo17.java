package com.dlx.test;

import java.util.Scanner;

public class TestDemo17 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base obj = (Base) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    public static String getClassName(Base obj) {

        return obj.getClass().getName();

    }

}

class Base {

}

class Sub1 extends Base {

}

class Sub2 extends Base {

}

