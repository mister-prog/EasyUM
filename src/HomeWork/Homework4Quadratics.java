package HomeWork;
//////////////////////////////////////////
// Квадратное уравнение
// a * x^2 + b * x + с == 0
// Вар-ты:
// --- D > 0, два корня ---
// x1 = -b + sqrt(b^2 - 4 * a * c) / 2 * a
// x2 = -b - sqrt(b^2 - 4 * a * c) / 2 * a
//
// --- D == 0, один корень ---
//x1 = x2 = -(b / 2 * a)
//
// --- D < 0, нет действит. корней ---
////////////////////////////////////////////

import java.util.Scanner;

public class Homework4Quadratics {
    public static void main(String[] args) {
        cuadratics();
    }

    public static void cuadratics() {
        System.out.println("Для решения квадратного уравнения введите три числа: a, b, c ");

        //todo проверить, что a != 0
        //todo проверить, что не появится -0
        double a = waitDouble();
        double b = waitDouble();
        double c = waitDouble();

        double discrim = b * b + 4 * a * c;

        if (discrim < 0) {
            System.out.println("Дискриминант меньше нуля => комплексные корни считать неохота =)");
        } else if (discrim > 0) {
            double x1 = (-1 * b + Math.sqrt(discrim)) / 2 * a;
            double x2 = (-1 * b - Math.sqrt(discrim)) / 2 * a;

            System.out.println("Дискриминант больше нуля => два искомых числа:\nx1 = " +  x1 + "\nx2 = " + x2);

        } else if (discrim == 0) {
            double x = -1 * b / 2 * a;
            System.out.println("Дискриминант равен нулю => одно искомое число:\nx1 = x2 = " + x);
        }
    }

    public static double waitDouble() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        //todo как сократить parseDouble()?
        while (!(isDouble(inputString))) {
            System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
            inputString = in.nextLine();
        }
        return Double.parseDouble(inputString);
    }

    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}


