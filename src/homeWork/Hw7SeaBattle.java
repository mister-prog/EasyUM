package homeWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Морской бой
// 1. нарисовать море
// 2. задать координаты
// 3. генерить кораблик
// 4. запрашивать координат точки
// 5. проверять, попал ли чел, отмечать на поле
//

public class Hw7SeaBattle {
    static final byte SEA_SIZE = 9;
    static final char SEA_WAVE = '~';
    static final char SHIP_CHAR = '\u2318';




    public static void main(String[] args) {
        seaBattlle();
    }

    private static void seaBattlle() {

        char[][] sea = new char [SEA_SIZE][SEA_SIZE];

        initSea(sea);
        printSea(sea);
        userShot();

    }

    static void initSea(char[][] sea)
    {

        for (byte i = 0; i < sea.length; i++)
        {
            for(byte j = 0; j < sea[i].length; j++)
            {
                sea[i][j] = SEA_WAVE;
            }
        }
    }

    static void printSea(char[][] sea)
    {
        printHeader();
        shipGen(sea);

        for (byte i = 0; i < sea.length; i++)
        {
            System.out.print((i + 1) + " ");
            for(byte j = 0; j < sea[i].length; j++)
            {
                System.out.print(sea[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printHeader()
    {
        System.out.print(" ");
        for (int i = 0 ; i < SEA_SIZE; i++)
        {
            char ch = (char)('A' + i);
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    static void shipGen(char[][] sea)
    {
        byte[] startPoint = {4, 4};
        byte shipLength = (byte)(ThreadLocalRandom.current().nextInt(1,5));
        boolean horizontal = true;

        byte shipX = startPoint[0];
        byte shipY = startPoint[1];

        if(horizontal)
        {
            byte i;
            for(i = 0; i < shipLength; i++)
            {
                sea[shipY][shipX + i] = SHIP_CHAR;
            }
        }
        else
        {
            byte j;
            for(j = 0; j <shipLength; j++)
            {
                sea[shipY + j][shipX] = SHIP_CHAR;
            }
        }
    }

//    static boolean hit( byte[] shipStarPoint, byte shipLength, boolean horizontal, byte[] userPoint)
//{
//    // попал / не попал
//}
    static void userShot()
    {
        byte i = 3;
        do{
            byte[] userPoint = inputUserPoint();
            System.out.println("\nuser point: " + Arrays.toString(userPoint));
            i--;
            System.out.println("\nОсталось попыток: " + i);
            //break;
        } while(i > 0);
    }

    private static byte[] inputUserPoint() {
        Scanner in = new Scanner(System.in);
        byte[] point = new byte[2];
        do {
            System.out.println("Ваш ход: ");
            String str = in.nextLine();
            System.out.println("ход " + str);
            if (str.length() != 2) {
                System.out.println("Неверный ввод: <символ><число>");
                continue;
            }

            char number = str.charAt(1);
            if(number < '1' || number > '9')
            {
                System.out.println("Неверное число: от 1 до 9 " + number);
                continue;
            }

            char symbol = str.charAt(0);
            if(symbol < 'a' || symbol > 'i')
            {
                System.out.println("Неверный символ: от a до i " + symbol);
                continue;
            }
            point[0] = (byte)(symbol - 'a') ;
            point[1] = (byte)(number - '1');
            break;
        } while (true);
        return point;
    }


}