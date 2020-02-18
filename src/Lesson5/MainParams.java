package Lesson5;

import java.util.Arrays;

public class MainParams {
    public static void main(String[] args) {
        int a = 90;
        System.out.println("before:  " + a);
        byValue(a);
        System.out.println("after: " + a);

        //массив беззащитен! Он меняется, а не копируется
        int[] b = {9, 32, 436};
        System.out.println("Before = " + Arrays.toString(b));
        byRef(b);
        System.out.println("After = " + Arrays.toString(b));

    }
    static void byValue(int a)
    {
        System.out.println("byValue = " + a);
        a = 5;
    }

    static void byRef(int[] a)
    {
        System.out.println("byRef = " + Arrays.toString(a));
        a[0] = -1;
        System.out.println("byRef = " + Arrays.toString(a));
    }
}
