package com.dlx.test;

import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        try {
            if (score > 100 || score < 0) {
                throw new ScoreException("分数不合法");
            } else {
                System.out.println(score);
            }
        }catch(ScoreException e){
            System.out.println(e.getMessage());
        }

    }
}

class ScoreException extends Exception {


    public ScoreException(String msg) {
        super(msg);
    }

}

