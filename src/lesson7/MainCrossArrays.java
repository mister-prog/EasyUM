package lesson7;

import java.util.Arrays;

public class MainCrossArrays {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 9, 3, 1, 0, 4, 2};
        int[] b = {1, 6, 3, 5, 1, 0};
        int[] c = sameElements(a, b);
        System.out.println("c = " + Arrays.toString(b));
    }

    static int[] sameElements(int[] a, int[] b) {
        int minLength = (a.length < b.length) ? a.length : b.length; //тернарная операция (условие ? да : иначе)
        int[] c = new int[minLength];
        int cLength = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++)
            {
                if(a[i] == b[j])
                {
                    c[cLength] = a[i];
                    cLength++;
                    break;
                }
            }

        }
    }
}
