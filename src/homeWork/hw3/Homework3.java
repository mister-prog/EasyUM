package homeWork.hw3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        // maxMinIfElse();
        isNotNull();
    }

    public static void isNotNull() {
        int a, b, c;

        //todo Вынести в отдельный метод!
        System.out.println("Введите целое число А: ");

        Scanner in = new Scanner(System.in);
        String strLine = in.nextLine();

        while (!(isInt(strLine))) {
            System.out.println("Вы ввели число некорректно: " + strLine
                    + "\nПовторите ввод");
            strLine = in.nextLine();
        }
        a = Integer.parseInt(strLine);

        System.out.println("Введите целое число В: ");

        strLine = in.nextLine();

        while (!(isInt(strLine))) {
            System.out.println("Вы ввели число некорректно: " + strLine
                    + "\nПовторите ввод");
            strLine = in.nextLine();
        }
        b = Integer.parseInt(strLine);

        System.out.println("Введите целое число C: ");

        strLine = in.nextLine();

        while (!(isInt(strLine)) || Integer.parseInt(strLine) == 0) {
            System.out.println("Вы ввели нулевое значение!\nПовторите ввод");
            strLine = in.nextLine();
        }
        c = Integer.parseInt(strLine);

        double result = (a + b + c * 2) / c;
        System.out.println("Результат (a + b + c * 2) / c, где a = " + a + ", b =  " + b + ", c = " + c + " равен " + result);
    }

    //Вывести максимальное из двух чисел
    public static void maxMinIfElse() {
        int a, b;
        System.out.println("Введите целое число А: ");

        Scanner in = new Scanner(System.in);
        String strLine = in.nextLine();

        while (!(isInt(strLine))) {
            System.out.println("Вы ввели число некорректно: " + strLine
                    + "\nПовторите ввод");
            strLine = in.nextLine();
        }
        a = Integer.parseInt(strLine);

        System.out.println("Введите целое число B: ");
        strLine = in.nextLine();

        while (!(isInt(strLine))) {
            System.out.println("Вы ввели число некорректно: " + strLine
                    + "\nПовторите ввод");
            strLine = in.nextLine();
        }
        b = Integer.parseInt(strLine);

        if (a < b) {
            System.out.println("Наибольшее число из A = " + a
                    + " и B = " + b + " число  B");
        } else if (a > b) {
            System.out.println("Наибольшее число из A = " + a
                    + " и B = " + b + " число  A");
        } else
            System.out.println("Числа A = " + a
                    + " и B = " + b + " равны");
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
}
