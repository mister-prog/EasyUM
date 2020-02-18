package HomeWork;

import Usefuls.UsefulMethods;

import java.util.Arrays;

public class Homework4Ranges {
    public static void main(String[] args) {
        twoRanges();
    }

    //----------------------------------------------
    //сделать массивами и for перебор
    public static void twoRanges() {
        System.out.println("Сформируйте два интервала\nВведите min и max первого интервала:");
        int[] range1 = inputRange();

        System.out.println("\nВведите min и max второго интервала:");
        int[] range2 = inputRange();

        setExists(range1);
        setExists(range2);
    }

    public static int[] inputRange() {
        int[] range = new int[2];
        for (int i = 0; i < 2; i++) {
            range[i] = UsefulMethods.waitInt();
        }
        return range;
    }

    public static void setExists(int[] range) {
        for (int i = 0; i < 1; i++) {
            if (range[i] > range[i + 1]) {
                System.out.println("\n");
                System.out.println(range[i] + " > " + range[i + 1]);
                System.out.println("Интервал не существует!");
            } else if (range[i] == range[i + 1]) {
                System.out.println("\n");
                System.out.println(range[i] + " = " + range[i + 1]);
                System.out.println("Это не интервал, а точка");
            } else {
                System.out.println("\n");
                System.out.println(range[i] + " < " + range[i + 1]);
                System.out.println("Интервал существует");
            }
            System.out.println(Arrays.toString(range));
        }
    }
}
