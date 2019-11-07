package ru.progwards.java1.lessons.helloworld;

public class Task2 {
    public static int subtraction (int x, int y){
        int z = x - y;
        return x - y;

    }

    public static void main(String[] args) {
        int z = subtraction(89, 55);
        System.out.println("Вызвана функция subtraction() с параметрами x = 89, y = 55");
        System.out.print("Результат z = ");
        System.out.print(z);

    }

}