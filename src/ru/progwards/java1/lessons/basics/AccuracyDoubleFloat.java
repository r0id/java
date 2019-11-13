package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    final static double pi = 3.14;
    final static double earthR = 6_371.2;

    public static double volumeBallDouble(double radius){ //3.1

        return pi *radius*radius*radius * 4/3;

    }
    public static float volumeBallFloat(float radius){ //3.2
        return  (float) pi * radius*radius*radius * 4/3;


    }

    public static double calculateAccuracy(double radius){ //3.3
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);

    }

    public static void main(String[] args) {
        System.out.println("volumeBallDouble(d): " + volumeBallDouble(1));
        System.out.println("volumeBallFloat(f): " + volumeBallFloat(1));
        System.out.println("volumeBallDoubleR(d): " + volumeBallDouble(earthR));
        System.out.println("volumeBallFloatR:(f) " + volumeBallFloat((float)earthR));
        System.out.println("calculateAccuracyR: " + calculateAccuracy(earthR));

    }
}
