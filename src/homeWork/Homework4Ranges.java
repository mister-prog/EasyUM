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
        rangeInfo(range1);

        System.out.println("\nВведите min и max второго интервала:");
        int[] range2 = inputRange();
        rangeInfo(range2);

        rangeRelations(range1, range2);
    }

    public static void rangeRelations(int[] range1, int[] range2) {
        int min1 = range1[0];
        int max1 = range1[range1.length - 1];

        int min2 = range2[0];
        int max2 = range2[range2.length - 1];

        System.out.println("\n");
        if ((rangeType(range1) == RangeStatus.ILLEGAL) || (rangeType(range2) == RangeStatus.ILLEGAL)) {
            System.out.println("\nОдин или оба интервала не существуют.\nПоиск пересечений не имеет смысла");
        } else {
            //rangePrint(range1, range2);
            if (min1 > max2 || min2 > max1) {
                System.out.println("Интервалы " + rangePrint(range1) + " и " + rangePrint(range2) + " не пересекаются");
            } else {
                if (min1 < min2) {
                    if (max1 >= max2) {
                        System.out.println("Интервал " +rangePrint(range1) + " содержит " + rangePrint(range2));
                    } else {
                        System.out.println("Интервалы " + rangePrint(range1) + " и " + rangePrint(range2) + " пересекаются");
                    }
                } else if (min1 > min2) {
                    if (max1 <= max2) {
                        System.out.println("Интервал " +rangePrint(range2) + " содержит " + rangePrint(range1));
                    } else {
                        System.out.println("Интервалы " + rangePrint(range1) + " и " + rangePrint(range2) + " пересекаются");
                    }
                } else if (min1 == min2) {
                    if (max1 > max2) {
                        System.out.println("Интервал " +rangePrint(range1) + " содержит " + rangePrint(range2));
                    } else if (max1 < max2) {
                        System.out.println("Интервал " +rangePrint(range2) + " содержит " + rangePrint(range1));
                    } else {
                        System.out.println("Интервалы идентичны");
                    }
                } else {
                    System.out.println("Где-то у меня косяк в расчетах =(");
                }
            }
        }
    }

  /*  public static void rangePrint(int[] range1, int[] range2) {
        System.out.print("Соотношение интервалов " + Arrays.toString(range1) + " и " + Arrays.toString(range2) + ":\n");
    }*/

    public static String rangePrint(int[] range) {
        return Arrays.toString(range);
    }

    public static int[] inputRange() {
        int[] range = new int[2];
        for (int i = 0; i < range.length; i++) {
            range[i] = ConsoleInput.waitInt();
        }
        return range;
    }

    public static RangeStatus rangeType(int[] range) {
        int i = 0;
        if (range[i] > range[range.length - 1]) {
            return RangeStatus.ILLEGAL;
        } else if (range[i] == range[range.length - 1]) {
            return RangeStatus.POINT;
        } else {
            return RangeStatus.LEGAL;
        }
    }

    public static void rangeInfo(int[] range) {

        System.out.println(Arrays.toString(range));
        switch (rangeType(range)) {
            case LEGAL:
                System.out.println("Интервал существует");
                break;
            case POINT:
                System.out.println("Это не интервал, а точка");
                break;
            case ILLEGAL:
                System.out.println("Интервал не существует!");
                break;
            default:
                System.out.println("Что-то пошло не так...");
        }
    }
}
