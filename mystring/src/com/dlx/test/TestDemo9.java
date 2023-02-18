package com.dlx.test;

import java.util.Random;

public class TestDemo9 {
    /*
    再见验证码
     */
    public static void main(String[] args) {
        String strA="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String strB="0123456789";
        Random r=new Random();
        System.out.print("产生的验证码为："+Yanzheng(strA,strB,r));
    }

    private static String Yanzheng(String strA, String strB ,Random r) {
        char[] chs=new char[5];
        /*
        产生数字位置的seed
         */
        int seed=r.nextInt(5);

        chs[seed]=strB.charAt(r.nextInt(strB.length()));

        for (int i = 0; i < chs.length; i++) {
            if(i==seed){
                continue;
            }
            chs[i]=strA.charAt(r.nextInt(strA.length()));
        }

        return new String(chs);
    }
}
