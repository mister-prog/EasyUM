package com.company; // базовый namespace - лучше задавать доменном-компании-наоборот

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ifElseKino();
        //switchCaseKino();
        //char ch =235;
       // System.out.println("Это char: " + ch);
    }

    static void ifElseKino() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите оценку фильма (1-5), чтобы узнать рецензию: ");
        String score = in.nextLine();


        while (!(isInt(score)) || Integer.parseInt(score) > 5 || Integer.parseInt(score) < 1) {
            System.out.println("Вы ввели некорректную оценку: " + score
                    + "\nВведите оценку от 1 до 5: ");
            score = in.nextLine();
        }

        if (score.equals("1")) {
            System.out.println("Оценка: " + score + "\nОтвратительный фильм. Смотреть не стоит");
        } else if (score.equals("2")) {
            System.out.println("Оценка: " + score + "\nПлохой фильм. Зря потраченное время");
        } else if (score.equals("3")) {
            System.out.println("Оценка: " + score + "\nТак себе фильм. На один раз");
        } else if (score.equals("4")) {
            System.out.println("Оценка: " + score + "\nХороший фильм. Идея интересная");
        } else if (score.equals("5")) {
            System.out.println("Оценка: " + score + "\nОтличный фильм! В личную копилку");
        }
        in.close();
    }

    //проверяем, парсится ли строка в число
    public static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void switchCaseKino() {
        System.out.println("Введите оценку фильма (1-5), чтобы узнать рецензию: ");

        Scanner in = new Scanner(System.in);
        String value = in.nextLine();

        while (!(isInt(value)) || Integer.parseInt(value) > 5 || Integer.parseInt(value) < 1) {
            System.out.println("Вы ввели некорректную оценку: " + value
                    + "\nВведите оценку от 1 до 5: ");
            value = in.nextLine();
        }

        //int intVal = Integer.parseInt(value);
        switch (value) {
            case "1":
                System.out.println("Оценка: " + value + "\nОтвратительный фильм. Смотреть не стоит");
                break;

            case "2":
                System.out.println("Оценка: " + value + "\nПлохой фильм. Зря потраченное время");
                break;

            case "3":
                System.out.println("Оценка: " + value + "\nТак себе фильм. На один раз");
                break;

            case "4":
                System.out.println("Оценка: " + value + "\nХороший фильм. Идея интересная");
                break;

            case "5":
                System.out.println("Оценка: " + value + "\nОтличный фильм! В личную копилку");
                break;

            default:
                System.out.println("Возникла непредвиденная ошибка. Пожалуйста, обратитесь к администратору");
        }
        in.close();
    }
}

