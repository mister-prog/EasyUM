package Lesson3;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Введите число ");
//        int chislo = in.nextInt();
//
//        System.out.println("Мы ввели " + chislo);
//
//        while (chislo == 0) {
//            System.out.println("Значение некорректно! Повторите ввод!\n");
//            chislo = in.nextInt();
//        }
//        System.out.println("Вы ввели: " + chislo);

//        //цикл со счетчиком
//        int c = 0;
//        while (c <= 11) {
//            System.out.println("Циферка " + c);
//            c++;
//        }
//        System.out.println("Итоговое число: " + c);

//        //с флагом
//        boolean real = true;
//        while (real) {
//            System.out.println("Введите число: ");
//            int tsiferka = in.nextInt();
//            if (tsiferka == 0)
//            {
//                System.out.println("Значение некорректно\nВведите снова\n");
//            }
//            else
//            {
//                real = false;
//            }
//        }

//        //без флага
//        while (true) {
//            System.out.println("Введите число: ");
//            int tsiferka = in.nextInt();
//            if (tsiferka == 0)
//            {
//                System.out.println("Значение некорректно\nВведите снова\n");
//            }
//            else
//            {
//                break;
//            }
//        }
//        System.out.println("Работа завершена");


        //c continue
        while (true) {
            System.out.println("Введите число: ");
            int tsiferka = in.nextInt();
            if (tsiferka == 0)
            {
                System.out.println("Значение некорректно\nВведите снова\n");
                continue;
            }
            break;
        }
        System.out.println("Работа завершена");
    }

}
