package lesson6;

import java.util.Arrays;

public class MainFilter {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 3, 1, 5, 7, 1, 9, 1, 0};
        int elem = -11;
        System.out.println("arr = " + Arrays.toString(arr));

        replace(arr, 1, elem);
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("unique resArr = " + Arrays.toString(unique(arr)));

    }

    static void replace(int[] arr, int fromValue, int toValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fromValue) {
                arr[i] = toValue;
            }
        }
    }

    //todo обрезать пустые элементы в массиве
    static int[] unique(int[] arr) {
        int[] resArr = new int[arr.length];
        int newLength = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean resultHasValue = false;

            for (int j = 0; j < newLength; j++) {
                if (resArr[j] == arr[i]) {
                    resultHasValue = true;
                    break;
                }
            }
            if (!resultHasValue) {
                resArr[newLength] = arr[i];
                newLength++;
            }
        }
        return resArr;
    }
}
