package ru.progwards.vvp;

import java.util.Scanner;

public class Test2 {


        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите радиус шара:");
            double value = sc.nextDouble();
            double volume = (4*Math.PI*Math.pow(value, 3))/3;
            System.out.println("Объем шара = "+volume);
        }

    }

