package homeWork;

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
        //userShot();
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
            for(byte i = 0; i < shipLength; i++)
            {
                sea[shipY][shipX + i] = SHIP_CHAR;
            }
        }
        else
        {
            for(byte j = 0; j <shipLength; j++)
            {
                sea[shipY + j][shipX] = SHIP_CHAR;
            }
        }
    }

}