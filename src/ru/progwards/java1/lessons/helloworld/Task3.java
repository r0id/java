package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static int addition(int x, int y){
        int j = x + y;
        return x + y;
    }

    public static int subtraction(int x, int y){
        int r = x - y;
        return x - y;
    }

    public static int multiplication(int x, int y){
        int t = x * y;
        return x * y;
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 55;
        int x = a;
        int y = b;
        int j = addition(a, b);
        int r = subtraction(a, b);
        int t = multiplication(a, b);
        System.out.println("Вызвана функция addition()");
        System.out.println("Вызвана функция subtraction()");
        System.out.println("Вызвана функция multiplication()");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("a + b = "+ j);
        System.out.println("a - b = "+ r);
        System.out.println("a * b = "+ t);
    }
}
