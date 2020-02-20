package lesson6;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MainFilter {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 3, 1, 5, 7, 1, 9, 1, 0};
        int elem = -11;
        System.out.println("arr = " + Arrays.toString(arr));

        replace(arr, 1, elem);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    static void replace(int[] arr, int fromValue, int toValue) {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == fromValue)
            {
                arr[i] = toValue;
            }
        }
    }
}
