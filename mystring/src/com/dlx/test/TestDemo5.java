package com.dlx.test;

public class TestDemo5 {
    /*
    敏感词替换
     */
    public static void main(String[] args) {
        //敏感词库
        String[] arr={"MLGB","TMD","CNM"};

        //替换语句
        String str="你会不会玩啊，TMD,CNM";

        //进行替换
        for (int i = 0; i < arr.length; i++) {
            str=str.replace(arr[i],"***");
        }

        //进行输出
        System.out.println(str);
    }
}
