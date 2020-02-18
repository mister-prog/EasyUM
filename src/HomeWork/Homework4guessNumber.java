package HomeWork;

import Usefuls.UsefulMethods;
import java.util.concurrent.ThreadLocalRandom;

public class Homework4guessNumber {
    public static void main(String[] args) {
        compicGame();
    }

    public static void compicGame() {
        System.out.println("Привет! Я - Компик =) Давай поиграем?\n\nЯ загадал целое число от 1 до 100\nПопробуй отгадать, а я подскажу ;)");

        int compicNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int humanNumber = UsefulMethods.waitInt();
        int counter = 1;

        while (humanNumber != compicNumber) {
            if (humanNumber > compicNumber) {
                System.out.println("Моё число меньше");
            } else {
                System.out.println("Моё число больше");
            }
            humanNumber = UsefulMethods.waitInt();
            counter++;
        }
        System.out.println("Ура! Ты угадал!\nМоё число " + compicNumber
                + "\n\nКоличество твоих попыток: " + counter);
    }
}