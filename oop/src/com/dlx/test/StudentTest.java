package com.dlx.test;

import com.dlx.bean.Student;

import java.util.Scanner;

public class StudentTest {
    /*
    定义一个数组，实现对数组中学生的curd
     */
    public static void main(String[] args) {
        Student[] stu=new Student[3];

        Scanner sc=new Scanner(System.in);
        //定义学生对象
        Student stu1=new Student(1,"张三",18);
        Student stu2=new Student(2,"李四",19);
        Student stu3=new Student(3,"王五",20);

        //赋值
        stu[0]=stu1;
        stu[1]=stu2;
        stu[2]=stu3;

        //定义要添加的学生对象
        Student stu4=new Student(4,"王二",18);

        //定义添加方法,并接受返回的新数组（或旧数组）
        Student[] students=addStu(stu,stu4);

        System.out.print("请输入你要删除的id:");
        int id=sc.nextInt();

        //定义删除方法
        Student[] students1=deleteStu(students,id);

        //定义查询方法
        System.out.print("请输入你要查询的id:");
        int id2=sc.nextInt();

        boolean flag=selectStu(students1,id2);
        if(!flag){
            System.out.println("删除失败。。。。。");
        }


    }

    private static boolean selectStu(Student[] students1, int id2) {
        for (int i = 0; i < students1.length; i++) {
            if(students1[i].getId()==id2){
                System.out.println("查询成功，索引为"+i);
                int age=students1[i].getAge()+1;
                students1[i].setAge(age);
                System.out.println("修改完成~~~"+students1[i].toString());
                return true;
            }
        }
        return false;
    }

    private static Student[] deleteStu(Student[] students, int id) {
        boolean flag=false;//判断是否存在的标志
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId()==id){
                flag=true;
                //创建新数组
                Student[] stu=createArr(students.length-1);
                for (int i1 = 0; i1 < stu.length; i1++) {
                    if(i1==i&&i!=students.length-1){
                        stu[i1]=students[i1+1];
                    }else{
                        stu[i1]=students[i1];
                    }
                }
                System.out.println("删除成功~~~");
                showStu(stu);
                return stu;
            }
        }
        if(!flag){
            System.out.println("该学号不存在，删除失败。。。。");
        }
        return students;
    }

    private static Student[] addStu(Student[] stu, Student stu4) {
        //定义计数器
        int count=0;//来判断数组中是否存满元素

        for (int i = 0; i < stu.length; i++) {
            if(stu[i]!=null){
                count++;
            }
        }

        //未存满
        if(count<stu.length){
            for (int i = 0; i < stu.length; i++) {
                //判断是否有相同的元素
                if(stu[i].getId()==stu4.getId()){
                    System.out.println("存在相同id,索引为"+i+",添加失败。。。");
                }
            }
            //没有相同元素
            stu[count]=stu4;
            showStu(stu);
            System.out.println("添加成功~~~~");
            return stu;
        }else{
            //创建新数组
            Student[] students=createArr(stu.length+1);
            for (int i = 0; i < stu.length; i++) {
                students[i]=stu[i];
            }
            students[count]=stu4;
            showStu(students);
            System.out.println("添加成功~~~~");
            return students;
        }
    }

    private static void showStu(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].toString());
        }
    }

    //创建新数组并返回
    private static Student[] createArr(int length) {
        Student[] students=new Student[length];
        return students;
    }

}
