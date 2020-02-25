package homeWork;

import java.util.Arrays;

import static usefuls.ConsoleInput.waitInt;

public class Homework6EqElems {
    public static void main(String[] args) {
        resultArray();
    }

    //вводит массив
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

        System.out.println("\nВы ввели массив: " + Arrays.toString(arr));
        return arr;
    }

    //Возвращает массив уникальных значений
    static int[] uniqueElemsArr(int[] arr) {
        int count = 0;
        int[] midArr = new int[arr.length];

        for (int i = 0; i < midArr.length; i++) {
            boolean resultHasValue = false;

            for (int j = 0; j < count; j++) {
                if (midArr[j] == arr[i]) {
                    resultHasValue = true;
                    break;
                }
            }
            if (!resultHasValue) {
                midArr[count] = arr[i];
                count++;
            }
        }

        int[] resultArr = new int[count];
        for (int i = 0; i < count; i++) {
            resultArr[i] = midArr[i];
        }
        //System.out.println("Result arr = " + Arrays.toString(resultArr));
        return resultArr;
    }


    static void resultArray() {
        int[] arr1 = uniqueElemsArr(inputArr());
        int[] arr2 = uniqueElemsArr(inputArr());

        if (arr1.length >= arr2.length) {
            sameElements(arr1, arr2);
        } else {
            sameElements(arr2, arr1);
        }
    }

    //сравнивает два массива, выводит уникальные пересечения
    static void sameElements(int[] arr1, int[] arr2) {

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

        //System.out.println("counter = " + counter);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    midArr[h] = arr2[j];
                    h++;
                }
            }
        }
        System.out.println("Уникальные элементы, существующие в обоих массивах: " + Arrays.toString(midArr));
    }
}


