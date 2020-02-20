package lesson5;

import java.util.Arrays;

public class MainMax {
    public static void main(String[] args) {
        int[] a = {4, 54, 43, 234, 1};
        int max = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("max = " + max
                + "\nArray = " + Arrays.toString(a));


        int[] b = {4, 54, 43, 234, 1};
        max = b[1];

        for (int i = 0; i < b.length; i++)
        {
            if (max < b[i])
            {
                max = b[i];
            }
        }
        System.out.println("max = " + max
                + "\nArray = " + Arrays.toString(b));

        int[] c = {4, 54, 43, 234, 1};
        max = Integer.MIN_VALUE;

        for (int i = 0; i < c.length; i++)
        {
            if (max < c[i])
            {
                max = c[i];
            }
        }
        System.out.println("max = " + max
                + "\nArray = " + Arrays.toString(b));


        max(a);
    }

    public static int max(int[] a)
    {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(result < a[i])
            {
                result = a[i];
            }
        }
        return result;
    }

    static void byValue(int a)
    {
        System.out.println("byValue = " + a);
        a = 5;
    }
}
