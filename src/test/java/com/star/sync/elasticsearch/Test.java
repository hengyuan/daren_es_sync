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
        System.out.println(LocalDateTime.parse("2018-05-04 11:00:00",formatter).format(formatter));
    }
}
