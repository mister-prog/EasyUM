package com.company; // базовый namespace - лучше задавать доменном-компании-наоборот

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //ifElseKino();
        switchCaseKino();
    }

    static void ifElseKino() {
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

    static void kinoman() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number (1-5): ");
        int val = in.nextInt();

        //System.out.printf("Your number: %d \n", num);

        switch (val) {
            case 1:
                System.out.println("Хреновое кино:  " + val);
                break;
            case 2:
                System.out.println("Плохое кино:  " + val);
                break;
            case 3:
                System.out.println("Так себе кино:  " + val);
                break;
            case 4:
                System.out.println("Нормальное кино:  " + val);
                break;
            case 5:
                System.out.println("Хорошее кино:  " + val);
                break;
            default:
                System.out.println("Ты чё ввёл?!\nНеправильно набран номер:  " + val);
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

