package ru.progwards.ru.progwards.java1.lessons.basics;

public class Astronomy {


    public static Double sphereSquare(Double r) { //2.1

        final double pi = 3.14;
        return 4 * pi * (r * r);

    }


    public static Double earthSquare(){ //2.2
     final double earthA = 6371.2;
     return sphereSquare(earthA);

    }


    public static Double mercurySquare(){ //2.3
        final double mercuryB = 2439.7;
        return sphereSquare(mercuryB);

    }

    public static Double jupiterSquare(){ //2.4
        final double jupiterC = 71492.0;
        return sphereSquare(jupiterC);


    }

    public static Double earthVsMercury(){ //2.5
        return earthSquare() / mercurySquare();

    }

    public static Double earthVsJupiter(){ //2.6
        return earthSquare() / jupiterSquare();

    }

    public static void main(String[] args) {
        System.out.println("" + sphereSquare(2.3));
        System.out.println("" + earthSquare());
        System.out.println("" + jupiterSquare());
        System.out.println("" + mercurySquare());
        System.out.println("" + earthVsMercury());
        System.out.println("" + earthVsJupiter());
    }
}



