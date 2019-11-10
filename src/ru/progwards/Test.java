/*
    Напишите метод, который возвращает дробную часть числа.
    Сигнатура метода static double fractional(double num)
    Например fractional(1.53) должен выдать 0.53
 */
package ru.progwards;

public class Test {
//    private static int d;
//    private static double num;
//    private static double num;
//
    //private static double i;

    public static void main(String[] args){


        System.out.println("num");
    }


  public static double fractional(double num) {
      double v = num % 1;
      return v;
    }

    double v = 1.53;
    int num = (int)v;


}