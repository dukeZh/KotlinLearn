package com.example.mylibrary;

import java.util.Random;

/**
 * @author DELL
 */
//java 函数的调用需要使用接口
public class TestClass0914 {
    public interface  DiscountWord{
        String getDiscountWord(String goodsName,int hour);
    }

    public static void main(String[] args) {
        showOnBoard("牙膏", new DiscountWord() {
            @Override
            public String getDiscountWord(String goodsName, int hour) {
                int currentYear = 2017;
                return currentYear+"年，双十一"+goodsName+ "促销倒计时："+hour+"小时";
            }
        });
    }

    public static void showOnBoard(String goodsName, DiscountWord discountWord){
        int hour = new Random().nextInt(24);
        System.out.println(discountWord.getDiscountWord(goodsName,hour));
    }
}
