package com.dlx.test;

import java.util.Scanner;

public class TestDemo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double s = scanner.nextDouble();
            // Circle和Square是需要你定义的类
            System.out.println(String.format("%.3f", new Circle(s).getArea()));
            System.out.println(String.format("%.3f", new Square(s).getArea()));
        }
    }
}

    class Shape {

        private double s; // 周长

        public Shape(double s) {
            this.s = s;
        }

        public double getS() {
            return s;
        }

    }

    interface Area {
        double getArea(); // 面积
    }

    // 圆形
    class Circle extends Shape implements Area {

        public Circle(double s) {
            super(s);
        }

        //write your code here......
        public double getArea() {
            return Math.pow((getS()) / (2 * Math.PI), 2) * Math.PI;
        }

    }

    // 方形
    class Square extends Shape implements Area {

        //write your code here......
        public Square(double s) {
            super(s);
        }

        public double getArea() {
            return Math.pow(getS() / 4, 2);
        }

    }


