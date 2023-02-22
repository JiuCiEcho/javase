package com.dlx.test;

import com.dlx.bean.Person;
import com.dlx.bean.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestCase {
    //创建静态变量，模拟数据库
    private static final ArrayList<Student> students = new ArrayList<>();

    //创建学生集合，模拟数据库
    private static final ArrayList<Person> persons = new ArrayList<>();

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
                    }
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
        int count = 3;//登录变量，机会共有三次
        while (true) {
            System.out.println("----------欢迎来到登录页面----------");
            if (persons.size() == 0) {
                System.out.println("当前数据库里面没有用户，请注册后再重试~~~~~");
                return false;
            } else {
                while (true) {
                    String yanzheng = getYanzheng();
                    System.out.println("验证码为"+yanzheng);
                    System.out.print("请输入验证码：");
                    String yanZhengT = sc.next();
                    if (yanzheng.equals(yanZhengT)) {
                        System.out.println("恭喜您，验证码输入正确~~~");
                        for (int i = 0; i < persons.size(); i++) {
                            Person p = persons.get(i);
                            System.out.print("请输入登录用户名：");
                            String username = sc.next();
                            System.out.print("请输入登录密码：");
                            String password = sc.next();
                            if (username.equals(p.getUsername()) && password.equals(p.getPassword())) {
                                System.out.println("恭喜您，登录成功~~~~");
                                return true;
                            } else {
                                System.out.println("账号或密码输入错误，请重试，还有" + count + "次机会呦~~~~");
                                count--;
                            }
                            count--;
                            if (count == 0) {
                                return false;
                            }
                        }
                    } else {
                        System.out.println("请重新输入验证码~~~~");
                    }
                }
            }

        }

    }

    private static void registerUse(Scanner sc) {
        Person p=new Person();
        System.out.println("---------欢迎来到注册页面-----------");
        System.out.print("请输入您的用户名：");
        String username=sc.next();
        if(username.length()<3||username.length()>15){
            System.out.println("用户名不符合规则，要在3到15之间~~~~");
            return;
        }else{
            if(UsernameIfExists(sc,username)){
                System.out.println("用户名已存在~~~~");
                return;
            }else{
                if(checkUsername(username)){
                    p.setUsername(username);
                    System.out.print("请输入您的密码：");
                    String password=sc.next();
                    System.out.print("请再次输入您的密码：");
                    String pwd=sc.next();
                    if(password.equals(pwd)){
                        p.setPassword(password);
                        System.out.print("请输入您的身份证号：");
                        String idNum=sc.next();
                        if(idNum.length()==18){
                            if(idNum.charAt(0)!='0'){
                                for (int i = 0; i < idNum.length(); i++) {
                                    if(i!=idNum.length()-1){
                                        if(idNum.charAt(i)<'0'||idNum.charAt(i)>'9'){
                                            System.out.println("身份证格式有误~~~~~");
                                            return;
                                        }
                                    }else{
                                        if(idNum.charAt(i)=='X'||idNum.charAt(i)=='x'||(idNum.charAt(i)>='0'&&idNum.charAt(i)<='9')){
                                            p.setIdNum(idNum);
                                            System.out.print("请输入你的手机号:");
                                            String  tel =sc.next();
                                            if(tel.length()==11){
                                                if(tel.charAt(0)!='0'){
                                                    p.setTel(tel);
                                                    persons.add(p);
                                                    System.out.println("注册成功~~~~~");
                                                }else{
                                                    System.out.println("手机号首位不能为零~~~~");
                                                    return;
                                                }
                                            }else{
                                                System.out.println("手机号长度不符合11位");
                                                return;
                                            }
                                        }else{
                                            return;
                                        }
                                    }
                                }
                            }else{
                                System.out.println("身份证首位不能为0");
                                return;
                            }
                        } else{
                            System.out.println("身份证号不满足18位~~~~~~");
                            return;
                        }
                    }else{
                        System.out.println("两次密码不一致~~~~~");
                        return;
                    }
                }else{
                    return;
                }
            }

        }
    }

    private static void forgetPwd(Scanner sc) {
        System.out.println("---------欢迎来到修改密码界面--------");
        System.out.print("请输入你要修改的用户id:");
        String username=sc.next();
        if(UsernameIfExists(sc,username)){
            System.out.print("请输入你的身份证号：");
            String idNum=sc.next();
            System.out.print("请输入你的手机号：");
            String tel=sc.next();
            Person p=returnPerson(username);
            if(p.getIdNum().equals(idNum)&&p.getTel().equals(tel)){
                System.out.print("请输入您要重置的密码：");
                String password=sc.next();
                p.setPassword(password);
                System.out.println("重置成功~~~~~~~");
            }else{
                System.out.println("账号信息不匹配，修改失败~~~~~");
                return;
            }
        }else{
            System.out.println("当前用户名未注册，请注册后重试~~~~~~");
            return;
        }

    }

    /**
     * 查询学生功能
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

    /**
     * 产生验证码
     *
     * @return 返回产生的验证码
     */
    public static String getYanzheng() {
        Random r = new Random();
        String strA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String strB = "0123456789";
        String result = "";
        int seed = r.nextInt(5);//记录数字的位置
        for (int i = 0; i < 5; i++) {
            if (i == seed) {
                result += strB.charAt(r.nextInt(strB.length()));
            }
            result += strA.charAt(r.nextInt(strA.length()));
        }
        return result;
    }

    /**
     * 判断用户名是否存在
     */
    public static boolean UsernameIfExists(Scanner sc,String username){
        if(persons.size()==0){
            return false;
        }
        for (int i = 0; i < persons.size(); i++) {
            Person p=persons.get(i);
            String name=p.getUsername();
            if(username.equals(name)){
                System.out.println("当前用户名存在~~~~");
                return true;
            }
        }
        return false;
    }

    /**
    根据用户名返回用户对象
     */
    public static Person returnPerson(String username){
        for (int i = 0; i < persons.size(); i++) {
            Person p=persons.get(i);
            String name=p.getUsername();
            if(username.equals(name)){
                return p;
            }
        }
        return null;
    }

    /**
     * 用户名校验
     * @param username 用户名
     * @return
     */
    public static boolean checkUsername(String username){
        int count=0;//数字个数计数
        boolean flag=false;
        for (int i = 0; i < username.length(); i++) {
            if((username.charAt(i)>='0'&&username.charAt(i)<='9')||(username.charAt(i)>='A'&&username.charAt(i)<='Z')||(username.charAt(i)>='a'&&username.charAt(i)<='z')){
                if(username.charAt(i)>='0'&&username.charAt(i)<='9'){
                    count++;
                }
                continue;
            }else{
                return flag;
            }
        }
        if(count==username.length()){
            System.out.println("用户名不能全为数字~~~~~");
            return flag;
        }
        return true;
    }
}
