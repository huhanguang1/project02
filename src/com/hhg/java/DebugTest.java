package com.hhg.java;

import java.util.HashMap;

/**
 * @author xiaoguang
 * @date 2020-08-13 - 14:26
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }

        HashMap<String,String> map = new HashMap<>();
        map.put("name","hhg");
        map.put("age","12");
        map.put("school","njxzc");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age=" + age);

        map.remove("major");
        System.out.println(map);
    }
}
