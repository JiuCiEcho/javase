package com.dlx.test;

import java.util.Calendar;
import java.util.Scanner;

public class CalcDemo {
    /*
    调用类输出一年中月份有多少天
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();

        Calendar calendar = Calendar.getInstance();
        for (int month = 1; month < 13; month++) {
            calendar.set(year, month, 0);
            System.out.println(year + "年" + month + "月:" + calendar.get(
                    calendar.DAY_OF_MONTH) + "天");
        }

    }
}
