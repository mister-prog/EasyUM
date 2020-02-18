package Usefuls;

import java.util.Scanner;

public class UsefulMethods {

    public static double waitDouble() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        //todo как сократить parseDouble()?
        while (!(isDouble(inputString))) {
            System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
            inputString = in.nextLine();
        }
        return Double.parseDouble(inputString);
    }

    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static int waitInt() {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();

        //todo как сократить parseInt()?
        while (!(isInt(inputString))) {
            System.out.println("Вы ввели число некорректно!\nПожалуйста, повторите ввод");
            inputString = in.nextLine();
        }
        return Integer.parseInt(inputString);
    }

    public static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
