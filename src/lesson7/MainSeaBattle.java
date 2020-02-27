package lesson7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainSeaBattle {

    static final int SEA_SIZE = 9;
    static final char SEA_CHAR = '~';
    static final char SHIP_CHAR = '\u2665';

    public static void main(String[] args) {
        char[][] sea = new char[SEA_SIZE][SEA_SIZE]; // море :)

        initSea(sea);

        //стартовая точка корабля
        byte[] shipStarPoint = {5, 5};

        // длина корабля
        byte shipLength = (byte) (ThreadLocalRandom.current().nextInt(1, 5));

        //горизонт/вертикал
        boolean horizontal = ThreadLocalRandom.current().nextBoolean();

        addShipToSee(sea, shipStarPoint, shipLength, horizontal);

        System.out.print("Морской бой!");
        printSea(sea);

        //todo ограничить тремя попытками

        do{
            System.out.println();
            byte[] userPoint = inputUserPoint();
            System.out.println("user point: " + Arrays.toString(userPoint));
            break;
        } while(true);
    }
/*static boolean hit( byte[] shipStarPoint, byte shipLength, boolean horizontal, byte[] userPoint)
{
    // попал / не попал
}*/

    private static byte[] inputUserPoint() {
        Scanner in = new Scanner(System.in);
        byte[] point = new byte[2];

        do {
            System.out.print("Ваш ход: ");
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

    private static void addShipToSee(char[][] sea, byte[] shipStarPoint, byte shipLength, boolean horizontal) {
        byte shipX = shipStarPoint[0];
        byte shipY = shipStarPoint[1];

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

    static void initSea(char[][] sea)
    {
        for (int i = 0; i < sea.length; i++)
        {
            for (int j = 0; j < sea[i].length; j++)
            {
                sea[i][j] = SEA_CHAR;
            }
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

    static  void printSea(char[][] sea)
    {
        printHeader();
        for (int i = 0; i < sea.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sea[i].length; j++)
            {
                System.out.print(sea[i][j] + " ");
            }
            System.out.println();
        }
    }


}
