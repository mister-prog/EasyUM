package homeWork;

import usefuls.ConsoleInput;

import java.util.Arrays;

public class Homework4Ranges {

    enum RangeStatus {
        LEGAL,
        POINT,
        ILLEGAL
    }

    public static void main(String[] args) {
        twoRanges();
    }

    public static void twoRanges() {
        System.out.println("Сформируйте два интервала\nВведите min и max первого интервала:");
        int[] range1 = inputRange();

        System.out.println("\nВведите min и max второго интервала:");
        int[] range2 = inputRange();

        if ((rangeExists(range1) == RangeStatus.ILLEGAL) || (rangeExists(range2) == RangeStatus.ILLEGAL)) {
            System.out.println("\nОдин или оба интервала не существуют.\nПоиск пересечений не имеет смысла");
        } else {
            rangeRelations(range1, range2);
        }
    }

    public static void rangeRelations(int[] range1, int[] range2) {
        int min1 = range1[0];
        int max1 = range1[range1.length - 1];

        int min2 = range2[0];
        int max2 = range2[range2.length - 1];

        System.out.println("\n");

        if (min1 > max2 || min2 > max1) {
            System.out.println("Интервалы " + Arrays.toString(rangePrint(range1)) + " и " + Arrays.toString(rangePrint(range2)) + " НЕ пересекаются");
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
                    System.out.println("Интервал ]" + min1 + ", " + max1 + "] содержит интервал [" + min2 + ", " + max2 + "]");
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

    public static int[] rangePrint(int[] range) {
        return range;
    }

    public static int[] inputRange() {
        int[] range = new int[2];
        for (int i = 0; i < range.length; i++) {
            range[i] = ConsoleInput.waitInt();
        }
        return range;
    }

    public static RangeStatus rangeExists(int[] range) {
        int i = 0;
        System.out.println(Arrays.toString(range));

        if (range[i] > range[range.length - 1]) {
            System.out.println("Интервал не существует!");
            return RangeStatus.ILLEGAL;
        } else if (range[i] == range[range.length - 1]) {
            System.out.println("Это не интервал, а точка");
            return RangeStatus.POINT;
        } else {
            System.out.println("Интервал существует");
            return RangeStatus.LEGAL;
        }
    }
}
