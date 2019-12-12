package com.atguigu.wordcount;

import java.util.Arrays;

public class sdasdas {
    public static void main(String[] args) {
        String a = "赖良赖良峰赖良峰赖良峰赖良峰赖良峰赖良峰赖良峰峰";
        byte[] bytes = a.getBytes();

        if (bytes.length>60){
            String s1 = new String(bytes);
            System.out.println(s1);
        }
    }
}
