package Lesson5;

import java.util.Arrays;

public class MainArrays
{
    public static void main(String[] args)
    {
        int[] a = new int[4];

        System.out.println("a = " + a.toString()); //работает плохо
        System.out.println("a = " + Arrays.toString(a));

        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        int[] b = {1, 3, 7};
        System.out.println("b = " + Arrays.toString(b));


        //System.out.println("args = " + Arrays.toString());
    }
}
