package Lesson3;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int chislo = in.nextInt();
//
//        System.out.println("Мы ввели " + chislo);

        prostoTsikl(chislo);

        //schetchikTsikl(chislo);
        flagTsikl(chislo);
//        breakTsikl(chislo);
//        continueTsikl(chislo);

        in.close();
    }

    public static void prostoTsikl(int chislo) {
        //просто цикл
        Scanner in = new Scanner(System.in);
        while (chislo == 0) {
            System.out.println("Значение некорректно! Повторите ввод!\n");
            chislo = in.nextInt();
        }
        System.out.println("Вы ввели: " + chislo);
    }

    public static void schetchikTsikl(int chislo) {
        //цикл со счетчиком
        Scanner in = new Scanner(System.in);
        int c = 0;
        while (c <= 11) {
            System.out.println("Циферка " + c);
            c++;
        }
        System.out.println("Итоговое число: " + c);
    }

    public static void flagTsikl(int chislo) {
        //с флагом
        Scanner in = new Scanner(System.in);
        boolean real = true;
        while (real) {
            System.out.println("Введите число: ");
            int tsiferka = in.nextInt();
            if (tsiferka == 0) {
                System.out.println("Значение некорректно\nВведите снова\n");
            } else {
                real = false;
            }
        }
    }

    public static void breakTsikl(int chislo) {
        //без флага
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            int tsiferka = in.nextInt();
            if (tsiferka == 0) {
                System.out.println("Значение некорректно\nВведите снова\n");
            } else {
                break;
            }
        }
        System.out.println("Работа завершена");
    }

    public static void continueTsikl(int chislo) {
        //c continue
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            int tsiferka = in.nextInt();
            if (tsiferka == 0) {
                System.out.println("Значение некорректно\nВведите снова\n");
                continue;
            }
            break;
        }
        System.out.println("Работа завершена");
    }
}
