package com.dlx.test;

import java.util.Scanner;

public class LoginTest {
    /*
    登录案例，一共给三次机会
    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for (int i = 3; i>0; i--) {
            System.out.println("请输入用户名：");
            String username=scanner.next();
            System.out.println("请输入密码：");
            String pwd=scanner.next();
            if(username.equals("admin")&&pwd.equals("admin")){
                System.out.println("登录成功~~~~");
                return;
            }else{
                System.out.println("登录失败，还有"+i+"次机会");
            }
        }
    }
}
