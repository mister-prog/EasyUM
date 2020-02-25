package lesson7;

import javax.swing.*;
import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[7][5];
        int[][] matrix2 = {{1, 3, 6}, {1, 8, 3, 8, 0}};

        for (int i = 0; i < matrix1.length; i++) {
            System.out.println("matrix[" + i + "] = " + Arrays.toString(matrix2[i]));
        }
        System.out.println("\n");

        printMatrix(matrix2);

        System.out.println("\n");

        printMatrix(addMatrix(matrix1, matrix2));
    }

    static int[][] addMatrix (int[][] a, int[][] b)
    {
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j =0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static void printMatrix(int[][] m)
    {
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                System.out.println("matrix[" + i + "; " + j + "] = " + Arrays.toString(m[i]));
            }
        }
    }
}
