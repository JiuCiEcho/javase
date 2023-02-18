package com.dlx.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo3 {
    /*
    添加三个学生对象，并以id为标识查询一个学生对象
     */
    public static void main(String[] args) {
        /*
        创建arraylist对象
         */
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        /*
        循环给学生对象赋值
         */
        for (int i = 0; i < 3; i++) {//这里不能使用list.size()来做临界条件，因为刚开始list的长度为零
            Student s=new Student();
            System.out.print("请输入用户名：");
            String username=sc.next();
            System.out.print("请输入密码：");
            String password=sc.next();
            System.out.print("请输入id号：");
            int id=sc.nextInt();
            s.setUsername(username);
            s.setPassword(password);
            s.setId(id);
            list.add(s);
        }

        /*
        查找相关学生，并进行结果打印
         */
        System.out.print("请输入要查询学生的id号：");
        int id=sc.nextInt();
        System.out.println("id值为"+id+"的学生存在情况为："+findStudentById(list,id));
    }

    private static boolean findStudentById(ArrayList<Student> list,int id) {
        //循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            if(s.getId()==id){
                return true;
            }
        }
        return false;
    }
}
