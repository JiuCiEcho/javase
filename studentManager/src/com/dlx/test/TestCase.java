package com.dlx.test;

import com.dlx.bean.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCase {
    //创建静态变量，模拟数据库
    private static final ArrayList<Student> students = new ArrayList<>();

    /*
    学生管理系统主入口
     */
    public static void main(String[] args) {

        /*
        制作菜单
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.print("请输入你的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (loginUse(sc)) {
                        System.out.println("1.添加学生");
                        System.out.println("2.删除学生");
                        System.out.println("3.修改学生");
                        System.out.println("4.查询学生");
                        System.out.println("5.退出");
                        System.out.print("请输入你的选择：");
                        int admin = sc.nextInt();
                        switch (admin) {
                            case 1:
                                //添加功能//
                                addStudent(sc);
                                break;
                            case 2:
                                //删除功能
                                deleteStudent(sc);
                                break;
                            case 3:
                                //修改功能
                                updateStudent(sc);
                                break;
                            case 4:
                                //查询功能
                                queryStudent(sc);
                                break;
                            case 5:
                                //退出
                                System.out.println("退出成功~~~~");
                                break;
                            default:
                                System.out.println("您输入的指令有误，请重试");
                        }
                    };
                    break;
                case 2:
                    registerUse(sc);
                    break;
                case 3:
                    forgetPwd(sc);
                    break;
                default:
                    System.out.println("您输入的指令有误，请重试");
                    break;
            }
        }
    }

    private static boolean loginUse(Scanner sc) {
        System.out.println("----------欢迎来到登录页面----------");

    }

    private static void registerUse(Scanner sc) {
    }

    private static void forgetPwd(Scanner sc) {
    }

    /**
     * 查询学生功能
     *
     * @param sc
     */
    private static void queryStudent(Scanner sc) {
        System.out.println("---------欢迎来到查询页面----------");
        if (students.size() == 0) {
            System.out.println("当前数据库里没有学生信息，请添加后查询~~~~~~");
            return;
        } else {
            System.out.println("当前学生信息如下：");
            System.out.println("id" + '\t' + "姓名" + '\t' + "年龄" + '\t' + "家庭住址");
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                System.out.println(s.getId() + '\t' + s.getName() + '\t' + s.getAge() + '\t' + s.getAddress());
            }
        }
    }

    /**
     * 更新学生对象
     *
     * @param sc
     */
    private static void updateStudent(Scanner sc) {
        System.out.println("---------欢迎来到更新页面----------");
        if (students.size() == 0) {
            System.out.println("当前数据库里没有学生信息，请添加后更新~~~~~~");
            return;
        } else {
            System.out.print("请输入要更新的学生id：");
            String id = sc.next();
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (id.equals(s.getId())) {
                    System.out.print("请输入你要更新的学生的姓名：");
                    String name = sc.next();
                    System.out.print("请输入你要更新的学生的地址：");
                    String address = sc.next();
                    System.out.print("请输入你要更新的学生的年龄：");
                    int age = sc.nextInt();
                    s.setName(name);
                    s.setAge(age);
                    s.setAddress(address);
                    return;
                }
            }
        }
        System.out.println("学生id不存在，请尝试添加后再更新~~~~~");
    }

    /**
     * 删除学生
     *
     * @param sc
     */
    private static void deleteStudent(Scanner sc) {
        System.out.println("---------欢迎来到删除页面----------");
        if (students.size() == 0) {
            System.out.println("当前数据库里没有学生信息，请添加后删除~~~~~~");
            return;
        } else {
            System.out.print("请输入要删除的学生id：");
            String id = sc.next();
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (id.equals(s.getId())) {
                    students.remove(s);
                    return;
                }
            }
        }
        System.out.println("学生id不存在，请尝试添加后再删除~~~~~");
    }

    /**
     * 添加学生
     *
     * @param sc
     */
    private static void addStudent(Scanner sc) {
        System.out.println("----------欢迎来到添加页面-----------");
        System.out.print("请输入你要添加学生的id:");
        String id = sc.next();
        System.out.print("请输入你要添加的学生的姓名：");
        String name = sc.next();
        System.out.print("请输入你要添加的学生的地址：");
        String address = sc.next();
        System.out.print("请输入你要添加的学生的年龄：");
        int age = sc.nextInt();

        Student s = new Student();
        if (students.size() == 0) {
            s.setAge(age);
            s.setId(id);
            s.setAddress(address);
            s.setName(name);
            students.add(s);
            System.out.println("添加完成~~~~~~~");
            queryStudent(sc);
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId().equals(id)) {
                    System.out.println("id添加重复，请重新添加~~~~~");
                    return;
                }
                s.setAge(age);
                s.setId(id);
                s.setAddress(address);
                s.setName(name);
                students.add(s);
                System.out.println("添加完成~~~~~~~");
                queryStudent(sc);
            }
        }
    }
}
