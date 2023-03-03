package com.dlx.test;

import java.util.Scanner;

public class TestDemo7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       TestDemo7 main = new TestDemo7();
        int number = console.nextInt();
        System.out.println(main.palindromeNumber(number));
    }

    public Boolean palindromeNumber(int number) {

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
