package mr.Prog;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        compicGame();
    }

    //Проверяем, является ли введенное с клавиатуры значение целым числом
    //Отлавливаем Exception, если не является
    public static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //Основной метод - диалог компа и человека
    public static void compicGame() {
        System.out.println("Привет! Я - Компик =) Давай поиграем?\n\nЯ загадал целое число от 1 до 100\nПопробуй отгадать, а я подскажу ;)");

        int compicNumber = numGen(1, 100);
        int humanNumber = waitInt();

        while (humanNumber != compicNumber) {
            if (humanNumber > compicNumber) {
                System.out.println("Моё число меньше");
            } else {
                System.out.println("Моё число больше");
            }
            humanNumber = waitInt();
        }
        System.out.println("Ура! Ты угадал!\nМоё число " + compicNumber);
    }

    //Запрашиваем ввод целого числа
    //Проверяем, число ли это
    //если число, парсим в int, возвращаем int
    public static int waitInt() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        while (!(isInt(inputString))) {
            System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
            inputString = in.nextLine();
        }
        // in.close();
        return Integer.parseInt(inputString);
    }

    //Генерим рандомное число в заданном диапазоне
    //Приводим число к int и возвращаем
    public static int numGen(int min, int max) {
        return min + (int) (Math.random() * max);
    }
}