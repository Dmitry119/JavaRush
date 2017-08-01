package com.javarush.task.task04.task0402;

import java.util.Scanner;

/*
Цена яблока
*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
          Scanner sc = new Scanner(System.in);
          applesPrice = sc.nextInt();

          //
        }
    }
}
