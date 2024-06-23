package com.example.ft2.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //现在开始工作了 加油加油
        System.out.println("===============搞起来====");
        System.out.println("===============搞起来====");
        System.out.println("===============搞起来====");
        System.out.println("===============搞起来====");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        //已经开始工作了 加油吧 同志们
        String str = "2024-03-08 12:34:30";
        System.out.println(sdf.parse(str));
    }
}
