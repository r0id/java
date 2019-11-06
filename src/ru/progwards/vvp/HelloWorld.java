package ru.progwards.vvp;

public class HelloWorld {
     static void println(String str){
//         String str; // объявление переменной
//         str = "Hello, World"; // инициализация
        System.out.print(str);
    }
    static int addition (int x, int y ){
//         int z = x + y; // складываем x + y
        return x + y; // возвращаем результат
    }
    public static void main (String[] args){
         println("Hello World!");
        println("World, are you hear me?");
        System.out.print("I know 5 + 7 = ");
//        int z = addition(5, 7);
        System.out.println(addition(5, 7));
//         helloWorld();
//         HelloWorld.helloWorld();
//        ru.progwards.vvp.HelloWorld.helloWorld();
    }
}
