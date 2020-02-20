package lesson6;

import java.util.Arrays;

public class MainEquals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int c = 1;
        int d = 1;

        //сравниваются не объекты, а ссылки, поэтому так сравнивать некорректно (касается объектов)
        if (a == b) {
            System.out.println("Равны");
        } else {
            System.out.println("НЕ равны");
        }

        //сравниваются по значению
        if (c == d) {
            System.out.println("Равны");
        } else {
            System.out.println("НЕ равны");
        }

        //так же не работает
        if (a.equals(b)) {
            System.out.println("Равны");
        } else {
            System.out.println("НЕ равны");
        }
//---------------------------------------
        if (arrayEquals(a, b)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы НЕ равны");
        }

        int[] f = {2,6,3,8,4};

        if (arrayEquals(a, f)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы НЕ равны");
        }
//---------------------------------------
        if (Arrays.equals(a, b)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы НЕ равны");
        }

        if (Arrays.equals(a, f)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы НЕ равны");
        }

    }

    static boolean arrayEquals(int[] arr1, int[] arr2) {
        //если массив один и тот же
        if (arr1 == arr2) {
            return true;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
