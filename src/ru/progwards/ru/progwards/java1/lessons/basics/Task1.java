package ru.progwards.ru.progwards.java1.lessons.basics;

public class Task1 {



    public static void main(String[] args) {

        System.out.println("" + reverseDigits(123));

    }

    public static int reverseDigits (int number) {
        return number % 10 * 100+ (number / 10) % 10 *10+ (number / 100);


    }



    }


