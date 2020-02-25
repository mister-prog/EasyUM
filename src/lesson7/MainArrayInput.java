package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class MainArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во элементов: ");
        int length = in.nextInt();

        if(length <= 0)
        {
            System.out.println("Число должно быть больше нуля!");
            return; //прерываем работу программы
        }

        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            System.out.print("a[" + i + "] = ");
            arr[i] = in.nextInt();
        }

        System.out.println("arr =  " + Arrays.toString(arr));
    }
}
