package com.learn.test;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList list = new ArrayList<Integer>();
        print(1);
    }

    public static void print(int a){
        System.out.println();
        String[] strs = new String[]{"a","b","c"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        for (String s : strs) {
            System.out.println(s);
        }



    }
}
