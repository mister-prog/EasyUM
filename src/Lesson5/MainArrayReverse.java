package Lesson5;

import java.util.Arrays;

public class MainArrayReverse
{
    public static void main(String[] args) {
        int[] revArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = revArr.length-1; i >= 0; i--)
        {
            System.out.println("a[" + i + "] = " + revArr[i]);
        }
    }
}
