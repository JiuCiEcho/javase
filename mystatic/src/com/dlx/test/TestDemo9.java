package com.dlx.test;

import java.util.Scanner;

public class TestDemo9 {
    public static void main(String[] args) {
        String string = "H e l l o ! n o w c o d e r";
        Scanner scanner= new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(check(string, word));
    }

    public static int check(String str, String word) {

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String str1="";
            str1=str1+ch;
            if(str1.equals(word)){
                count++;
            }
        }
        return count;
    }
}
