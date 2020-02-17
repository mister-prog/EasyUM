package mr.Prog;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework4 {
    public static void main(String[] args) {
        compicGame();
    }

    public static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void compicGame() {
        System.out.println("Привет! Я - Компик =) Давай поиграем?\n\nЯ загадал целое число от 1 до 100\nПопробуй отгадать, а я подскажу ;)");

        int compicNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int humanNumber = waitInt();
        int counter = 1;

        while (humanNumber != compicNumber) {
            if (humanNumber > compicNumber) {
                System.out.println("Моё число меньше");
            } else {
                System.out.println("Моё число больше");
            }
            humanNumber = waitInt();
            counter++;
        }
        System.out.println("Ура! Ты угадал!\nМоё число " + compicNumber
                + "\n\nКоличество твоих попыток: " + counter);
    }

    public static int waitInt() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        while (!(isInt(inputString))) {
            System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
            inputString = in.nextLine();
        }
        return Integer.parseInt(inputString);
    }
}