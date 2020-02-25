package lesson7;

import java.util.Arrays;

public class MainCrossArrays {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 9, 3, 1, 0, 4, 2};
        int[] b = {1, 6, 3, 5, 1, 0};
        int[] c = sameElements(a, b);

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    //ищем индекс элемента test в массиве b
    static int find(int[] b, int test) {
        for (int j = 0; j < b.length; j++) {
            if (test == b[j]) {
                return j;
            }
        }
        return -1;
    }

    static int[] sameElements(int[] a, int[] b) {
        //int minLength = (a.length < b.length) ? a.length : b.length; //тернарная операция (условие ? да : иначе)
        int minLength = min(a.length, b.length);
        int[] c = new int[minLength];
        int cLength = 0;

        for (int i = 0; i < a.length; i++) {
            if (find(b, a[i]) != -1) {
                c[cLength] = a[i];
                cLength++;
            }
            /*for (int j = 0; j < b.length; j++)
            {
                if(a[i] == b[j])
                {
                    c[cLength] = a[i];
                    cLength++;
                    break;
                }
            }*/
        }
        return c;
    }
}
