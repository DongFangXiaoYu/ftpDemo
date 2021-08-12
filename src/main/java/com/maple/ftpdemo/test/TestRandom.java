package com.maple.ftpdemo.test;

/**
 * @description 测试随机生成四位整数
 * @AUTHER: sk
 * @DATE: 2021/7/13
 **/

public class TestRandom {
    public static void main(String[] args) {

        int i=(int)(Math.random()*900)+1000;
        System.out.println("i="+i);
    }
}
