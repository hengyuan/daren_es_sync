package com.star.sync.elasticsearch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: hanjiafu
 * Date: 18-4-21
 * Time: 下午4:57
 * Detail:
 */
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = "2018-02-18 01:27:00";
        if("00".equals(date.substring(date.length()-2))){
            date = date.substring(0,date.length()-2)+"01";
        }
        System.out.println(LocalDateTime.parse(date,formatter));
    }
}
