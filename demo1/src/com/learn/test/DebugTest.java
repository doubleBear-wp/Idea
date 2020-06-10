package com.learn.test;

import java.util.HashMap;

/**
 * @author doubleBear
 * @create 2020 06 10 17:40
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school","北交大");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
    }
}
