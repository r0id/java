package ru.progwards.ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    final static double pi = 3.14;
    final static double earthR = 6371.2;

    public static double volumeBallDouble(double radius){ //3.1

        return 4/3 * pi *(radius*radius*radius);

    }
    public static float volumeBallFloat(float radius){ //3.2
        return 4 /3 * 3.14f * (radius*radius*radius);


    }

    public static double calculateAccuracy(double radius){ //3.3
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);

    }

    public static void main(String[] args) {
        System.out.println("volumeBallDouble: " + volumeBallDouble(1));
        System.out.println("volumeBallFloat: " + volumeBallFloat(1));
        System.out.println("volumeBallFloatR: " + volumeBallFloat((float)earthR));
        System.out.println("calculateAccuracyR: " + calculateAccuracy(earthR));

    }
}
