package lesson6;

import java.util.Arrays;

public class MainFind {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 100, -11, 4, 8, 2, 3, 12, 3, 457, 3, 767, 3, 34, 3, 23, 7};

        System.out.println("Index = " + find(arr, -11) + "\nPosition = " + (find(arr,-11) + 1));
        System.out.println("Contains = " + contains(arr, 3));

        System.out.println("Index = " + find(arr, 599) + "\nPosition = " + (find(arr,500) + 1));
        System.out.println("Contains = " + contains(arr, 599));

        System.out.println("count of element = " + countOfElement(arr,3));

    }
    //сколько раз элемент входит в массив
    static int countOfElement(int[] arr, int el)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == el)
            {
                count++;
            }
        }
        return count;
    }

    static boolean contains (int[] arr, int element)
    {
        int index = find(arr,element);
        return index != -1;
    }

    static int find(int[] arr, int element)
    {
        int index = -1; //по умолчанию - элемента нет
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == element)
            {
                index = i;
                break;
            }
        }
        return index;
    }
}
