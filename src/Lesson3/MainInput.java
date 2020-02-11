package Lesson3;

import java.util.Scanner;

public class MainInput {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int chislo = in.nextInt();

        System.out.println("Мы ввели " + chislo);

        while (chislo == 0)
        {
            System.out.println("Значение некорректно! Повторите ввод!\n");
            chislo = in.nextInt();
        }
        System.out.println("Вы ввели: " + chislo);
    }
    }
