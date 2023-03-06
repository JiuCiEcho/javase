package com.dlx.test;

import java.util.Scanner;

public class TestDemo10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println(palindromeNumber(number));
    }

    public static Boolean palindromeNumber(int number) {

        int fb=number;
        int sum=0;
        for(int i=0;i<5;i++){
            int ge=number%10;
            sum=sum*10+ge;
            number=number/10;
        }
        if(sum==fb){
            return true;
        }
        return false;
    }
}
