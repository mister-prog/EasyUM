package com.company; // базовый namespace - лучше задавать доменном-компании-наоборот
import  java.util.Scanner;

public class Main {
/*
    enum Color { // перечисления
        GREEN,
        VIOLET,
        RED,
        GOLD
    }

    {
        int a = 6;
        String str = "Hello, Friend!";
        System.out.println (a);
    }*/



/*
    static void colorText(Color color) {
        String colorText = "";
        switch (color) {
            case GREEN:
                colorText = "Зелёный";
                break;
            case VIOLET:
                colorText = "Фиолетовый";
                break;
            case RED:
                colorText = "Красный";
                break;
            default:
                colorText = "Голубой";
        }
        System.out.print("\nЦвет: " + colorText);
    }*/

    public static void main(String[] args) {
        // write your code here
//        String str = "Result: ";
//        char c = '%';
//        int a = 5;
//        int b = 7;
//        int r = test(5,7);
//
//        boolean cond = true;
//        boolean notCond = !cond;
//        boolean dynCond = a > b;
//
//        /*System.out.println("Переменная а равна " + a + "\nПеременная b равна " + b
//                + "\nСумма a и b равна " + (a + b));
//
//        System.out.println("Теперь выводим возвращаемое значение метода sum: " + test(a,b));

//
//        if (a > b) {
//            System.out.println("Значение переменной a БОЛЬШЕ значения переменной b");
//        }
//        else {
//            System.out.println("Значение переменной a МЕНЬШЕ или РАВНО значения переменной b");
//        }
        // ifAge(23);
        // caseAge(2);
        // colorText(Color.GOLD);
        votTakoeKino();


    }
    static void votTakoeKino() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number (1-5): ");
        int score = in.nextInt();

        //System.out.printf("Your number: %d \n", num);


        if (score < 1 || score > 5) {
            System.out.println("Ошибочное значение счета [1;9] " + score);
        } else {
            if (score == 1) {
                System.out.println("Хреновое кино:  " + score);
            } else if (score == 2) {
                System.out.println("Плохое кино:  " + score);
            } else if (score == 3) {
                System.out.println("Так себе кино:  " + score);
            } else if (score == 4) {
                System.out.println("Нормальное кино:  " + score);
            } else if (score == 5) {
                System.out.println("Хорошее кино:  " + score);
            }
        }
        in.close();
    }
    /*

    static void ifAge(int age) {
        System.out.println("Возраст человека: " + age + " года/лет");

        if (age < 50) {
            System.out.println("Ребенок");
            System.out.println("Цвет одежды: зеленый");//1
        } else if (age < 80) {
            System.out.println("Подросток");
            System.out.println("Цвет одежды: фиолетовый");//2
        } else if (age < 100) {
            System.out.println("Взрослый");
            System.out.println("Цвет одежды: красный");//3
        } else {
            System.out.println("Вот ты долгожитель!");
        }
    }

    static void caseAge(int colorCode) {
        String colorText = "";
        switch (colorCode) {
            case 1:
                colorText = "Зелёный";
                break;
            case 2:
                colorText = "Фиолетовый";
                break;
            case 3:
                colorText = "Красный";
                break;
            default:
                colorText = "Голубой";
        }
        System.out.print("Цвет: " + colorText);
    }

    static int test(int a, int b) {
        return a + b;
    }
*/



}

