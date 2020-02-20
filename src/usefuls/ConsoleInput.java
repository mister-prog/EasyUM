package usefuls;

import java.util.Scanner;

public class ConsoleInput {

    public static double waitDouble() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();
        boolean isDouble;

        do {
            try {
               Double.parseDouble(inputString);
                isDouble = true;
            } catch (Exception e) {
                isDouble = false;
                System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
                inputString = in.nextLine();
            }
        }  while(!isDouble);
        return Double.parseDouble(inputString);
    }

    public static int waitInt() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();
        boolean isInt;

        do {
            try {
                Integer.parseInt(inputString);
                isInt = true;
            } catch (Exception e) {
                isInt = false;
                System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
                inputString = in.nextLine();
            }
        } while (!isInt);
        return Integer.parseInt(inputString);
    }
}