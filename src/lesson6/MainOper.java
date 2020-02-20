//todo сделать удаление эл-та из массива
package lesson6;

import java.util.Arrays;

public class MainOper {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 11, 76, 5};
        System.out.println("arr = " + Arrays.toString(arr));

        int[] arr2 = insert(arr, 9, 15);
        System.out.println("arr2 = " + Arrays.toString(arr2));

        //вставим новый элемент
    }

    /**
     * Создаем массив на основе исходного arr, вставив elem в позицию index
     * @author mr.Prog
     * @param arr - исходный массив
     * @param index - индекс для вставки элемента
     * @param elem - значение для вставки
     * @return новый массив
     */

    static int[] insert(int[] arr, int index, int elem)
    {
        if (index >= arr.length || index < 0)
        {
            return new int[0]; //пустой массив
        }

        //запрашиваем длину исходного, прибавляем один элемент
        int[] resArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++)
        {
            resArr[i] = arr[i];
        }
        resArr[index] = elem;
        for(int i = index; i < arr.length; i++)
        {
            resArr[i + 1] = arr[i];
        }
        return resArr;
    }
}
