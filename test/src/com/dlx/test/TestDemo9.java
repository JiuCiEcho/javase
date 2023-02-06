package com.dlx.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestDemo9 {
    /*
    统计字母数量
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        line=line.replaceAll("[^a-zA-Z]","");
        for(int i=0;i<line.length();i++){
            char c=line.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrys) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
