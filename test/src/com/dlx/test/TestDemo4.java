package com.dlx.test;

import java.util.Scanner;

public class TestDemo4 {
    /*
    定义打印方法
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();

            print(Class.forName(className).newInstance());
        }
    }

    public static void print(Object o){
        System.out.println(o.getClass().getName());
    }

}

class First {
    public String toString() {
        return "First";
    }
}

class Second {
    public String toString() {
        return "Second";
    }
}

class Third {
    public String toString() {
        return "Third";
    }
}

