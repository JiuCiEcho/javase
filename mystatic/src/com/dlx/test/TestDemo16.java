package com.dlx.test;

import java.util.Scanner;

public class TestDemo16 {


    public static void main(String[] args) {
        PersonTwo p = new PersonTwo();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class PersonTwo {

    private int age;
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 200) {
            this.age = 200;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}



