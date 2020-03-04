package homeWork.hw4;

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

        rangeSummaryInfo(range1, range2);
    }

    public static int rangeRelations(int[] r1, int[] r2) {
        int min1 = r1[0];
        int max1 = r1[r1.length - 1];

        int min2 = r2[0];
        int max2 = r2[r2.length - 1];

        int rangeRel;

        if ((rangeType(r1) == RangeStatus.ILLEGAL) || (rangeType(r2) == RangeStatus.ILLEGAL)) {
            rangeRel = -1;
        } else {
            if (min1 > max2 || min2 > max1) {
                rangeRel = 0;
            } else {
                if (min1 < min2) {
                    if (max1 >= max2) {
                        rangeRel = 1;
                    } else {
                        rangeRel = 3;
                    }
                } else if (min1 > min2) {
                    if (max1 <= max2) {
                        rangeRel = 2;
                    } else {
                        rangeRel = 3;
                    }
                } else {
                    if (max1 > max2) {
                        rangeRel = 1;
                    } else if (max1 < max2) {
                        rangeRel = 2;
                    } else {
                        rangeRel = 4;
                    }
                }
            }
        }
        return rangeRel;
    }

    public static void rangeSummaryInfo(int[] range1, int[] range2) {
        int rangeRel = rangeRelations(range1, range2);

        switch (rangeRel) {
            case 0:
                System.out.println("\nИнтервалы " + rangePrint(range1) + " и " + rangePrint(range2) + " не пересекаются");
                break;
            case 1:
                System.out.println("\nИнтервал " + rangePrint(range1) + " содержит " + rangePrint(range2));
                break;
            case 2:
                System.out.println("\nИнтервал " + rangePrint(range1) + " содержится в " + rangePrint(range2));
                break;
            case 3:
                System.out.println("\nИнтервалы " + rangePrint(range1) + " и " + rangePrint(range2) + " пересекаются");
                break;
            case 4:
                System.out.println("\nИнтервалы идентичны");
                break;
            case -1:
                System.out.println("\nОдин или оба интервала не существуют.\nПоиск пересечений не имеет смысла");
                break;
            default:
                System.out.println("\nЧто-то пошло не так...");
        }
    }

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
