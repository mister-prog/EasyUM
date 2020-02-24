package homeWork;

import java.util.Arrays;

import static usefuls.ConsoleInput.waitInt;

public class Homework6EqElems {
    public static void main(String[] args) {
        arraysEqualElems();
    }

    static void arraysEqualElems() {
        System.out.println("Введите два массива");

        int[] arr1 = inputArr();
        System.out.print("Вы ввели первый массив " + Arrays.toString(arr1) + "\n");

        int[] arr2 = inputArr();
        System.out.print("Вы ввели второй массив " + Arrays.toString(arr2) + "\n");

        /* System.out.print("Общие элементы массивов " + Arrays.toString(arr1) + " и " + Arrays.toString(arr2) + ":\n" + Arrays.toString(equalElems(arr1, arr2)));*/
        equalElems(arr1, arr2);
    }

    static void equalElems(int[] arr1, int[] arr2) {
        int counter;
        if (arr1.length >= arr2.length) {
            findUniques(arr1, arr2);
        } else {
            findUniques(arr2, arr1);
        }
    }

    static void findUniques(int[] arr1, int[] arr2) {
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    counter++;
                }
            }
        }

        //todo придумать, как упростить метод: сначала - считаем одинаковые, затем - создаем массив, сохраняя одинаковые

        int[] midArr = new int[counter];
        int h = 0;

        //todo сделать проверку на уникальность
        System.out.println("counter = " + counter);

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        midArr[h] = arr2[j];
                        h++;
                    }
                }
            }

        System.out.println("Уникальные элементы, встречающиеся в обоих массивах: " + Arrays.toString(midArr));
    }

    static int[] inputArr() {
        System.out.println("\nВведите кол-во элементов нового массива: ");
        int arrLength = waitInt();

        while (arrLength <= 0) {
            System.out.println("Количество элементов должно быть больше нуля.\nПожалуйста, повторите ввод:");
            arrLength = waitInt();
        }

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = waitInt();
        }
        return arr;
    }
}

