package com.test.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;

public class SwipeTools {

    /**
     * driver 操作句柄
     * speed 滑动时间/速度，以毫秒为单位
     * num 滑动次数
     */

    // 上滑
    public static void swipeUP(AppiumDriver driver, int speed , int num) throws InterruptedException {
        //获得屏幕分辨率/大小
        Dimension size = driver.manage().window().getSize();

        //获得屏幕宽度，也就是x轴
        int width = size.width;

        //获得屏幕宽度，也就是y轴
        int height = size.height;

        //for循环，进行滑动次数操作
        for (int i = 0; i < num; i++){
            driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, speed);
            Thread.sleep(3000);
        }
    }



    // 下滑
    public static void swipeDown(AppiumDriver driver, int speed , int num) throws InterruptedException {
        //获得屏幕分辨率/大小
        Dimension size = driver.manage().window().getSize();

        //获得屏幕宽度，也就是x轴
        int width = size.width;

        //获得屏幕宽度，也就是x轴
        int height = size.height;

        //for循环，进行滑动次数操作
        for (int i = 0; i < num; i++){
            driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, speed);
            Thread.sleep(3000);
        }
    }



    // 左滑
    public static void swipeLeft(AppiumDriver driver, int speed , int num) throws InterruptedException {
        //获得屏幕分辨率/大小
        Dimension size = driver.manage().window().getSize();

        //获得屏幕宽度，也就是x轴
        int width = size.width;

        //获得屏幕宽度，也就是x轴
        int height = size.height;

        //for循环，进行滑动次数操作
        for (int i = 0; i < num; i++){
            driver.swipe(height / 2, width * 3 / 4, height / 2, width / 4, speed);
            Thread.sleep(3000);
        }
    }



    // 右滑
    public static void swipeRight(AppiumDriver driver, int speed , int num) throws InterruptedException {
        //获得屏幕分辨率/大小
        Dimension size = driver.manage().window().getSize();

        //获得屏幕宽度，也就是x轴
        int width = size.width;

        //获得屏幕宽度，也就是x轴
        int height = size.height;

        //for循环，进行滑动次数操作
        for (int i = 0; i < num; i++){
            driver.swipe(height / 2, width / 4, height / 2, width * 3 / 4, speed);
            Thread.sleep(3000);
        }
    }
}