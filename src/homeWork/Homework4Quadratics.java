package homeWork;

import usefuls.ConsoleInput;

public class Homework4Quadratics {
    public static void main(String[] args) {
        cuadratics();
    }

    public static void cuadratics() {
        System.out.println("Для решения квадратного уравнения введите три числа: a (!=0), b, c ");

        double a = ConsoleInput.waitDouble();
        while(a == 0)
        {
            System.out.println("Некорректный ввод! Число \'а\' не должно быть равно нулю!");
            a = ConsoleInput.waitDouble();
        }

        double b = ConsoleInput.waitDouble();
        double c = ConsoleInput.waitDouble();
        System.out.println("Вы ввели: \na = " + a + "\nb = " + b + "\nс = " + c);

        double discrim = b * b - 4 * a * c;
        System.out.println("\nДискриминант = " + discrim);

        if (discrim < 0) {
            System.out.println("\nДискриминант меньше нуля => комплексные корни считать неохота =)");
        } else if (discrim > 0) {

            double x1 = (-b + Math.sqrt(discrim)) / (2 * a);
            double x2 = (-b - Math.sqrt(discrim)) / (2 * a);

            System.out.println("\nДискриминант больше нуля => два искомых числа:\nx1 = " +  x1 + "\nx2 = " + x2);

        } else if (discrim == 0) {
            double x = b / 2 * a;
            System.out.println("\nДискриминант равен нулю => одно искомое число:\nx1 = x2 = " + x);
        }
    }
}


