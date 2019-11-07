package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static int addition(int x, int y){ //3.1
//        int x = a;
//        int y = b;
//        int c = x + y;
        return x + y;

    }
    public static int subtraction(int x, int y){ //3.2

        return x - y;
    }

    public static int multiplication(int x, int y){ //3.3
        return x * y;

    }


    public static void main(String[] args){
        int  a, b , c;
        a = 34;
        b = 55;

//        int c = addition(34, 55);

        System.out.println("Вызвана функция subtraction()");
        System.out.println("Вызвана функция subtraction()");
        System.out.println("Вызвана функция multiplication()");
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);
//        System.out.println("a + b =");
//        System.out.print(c);

    }

}

