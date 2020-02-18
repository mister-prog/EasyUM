package HomeWork;

import Usefuls.UsefulMethods;

import java.util.Arrays;

public class Homework4Ranges {
    public static void main(String[] args) {
        twoRanges();
    }

    public static void twoRanges() {
        System.out.println("Сформируйте два интервала\nВведите min и max первого интервала:");
        int[] range1 = inputRange();

        System.out.println("\nВведите min и max второго интервала:");
        int[] range2 = inputRange();

        boolean r1 = setExists(range1);
        boolean r2 = setExists(range2);

        System.out.println("\n");
        if(r1 && r2)
        {
            rangeRelations(range1, range2);
        }
        else
        {
            System.out.println("Один из интервалов не существует: проверка вхождения бкссмысленна");
        }
    }

    public static void rangeRelations(int[] range1, int[] range2) {
        int min1 = range1[0];
        int max1 = range1[1];

        int min2 = range2[0];
        int max2 = range2[1];

        //System.out.println("\n");

        if (min1 > max2 || min2 > max1) {
            System.out.println("Интервалы [" + min1 + ", " + max1 + "] и [" + min2 + ", " + max2 + "] НЕ пересекаются");
        } else {
            if (min1 < min2) {
                if (max1 >= max2) {
                    System.out.println("Интервал [" + min1 + ", " + max1 + "] содержит интервал [" + min2 + ", " + max2 + "]");
                } else {
                    System.out.println("Интервалы [" + min1 + ", " + max1 + "] и [" + min2 + ", " + max2 + "] пересекаются");
                }
            } else if (min1 > min2) {
                if (max1 <= max2) {
                    System.out.println("Интервал [" + min2 + ", " + max2 + "] содержит интервал [" + min1 + ", " + max1 + "]");
                } else {
                    System.out.println("Интервалы [" + min1 + ", " + max1 + "] и [" + min2 + ", " + max2 + "] пересекаются");
                }
            } else if (min1 == min2) {
                if (max1 > max2) {
                    System.out.println("Интервал [" + min1 + ", " + max1 + "] содержит интервал [" + min2 + ", " + max2 + "]");
                } else if (max1 < max2) {
                    System.out.println("Интервал [" + min2 + ", " + max2 + "] содержит интервал [" + min1 + ", " + max1 + "]");
                } else {
                    System.out.println("Интервалы идентичны");
                }
            } else {
                System.out.println("Где-то у меня косяк в расчетах =(");
            }
        }
    }

    public static int[] inputRange() {
        int[] range = new int[2];
        for (int i = 0; i < 2; i++) {
            range[i] = UsefulMethods.waitInt();
        }
        return range;
    }

    public static boolean setExists(int[] range) {
        int i = 0;
        System.out.println(Arrays.toString(range));

        if (range[i] > range[i + 1]) {
            // System.out.println(range[i] + " > " + range[i + 1]);
            System.out.println("Интервал не существует!");
            return false;
        } else if (range[i] == range[i + 1]) {
            //System.out.println(range[i] + " = " + range[i + 1]);
            System.out.println("Это не интервал, а точка");
            return true;
        } else {
            //System.out.println(range[i] + " < " + range[i + 1]);
            System.out.println("Интервал существует");
            return true;
        }
    }
}
