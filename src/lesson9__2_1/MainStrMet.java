package lesson9__2_1;

import java.util.Arrays;

public class MainStrMet {
    public static void main(String[] args) {
        String str = "Какой-то длинный неинтересный текст...";
        System.out.println("length = " + str.length());
        System.out.println("str[11] = " + str.charAt(11));
        System.out.println("UpperCase = " + str.toUpperCase());
        System.out.println("lowerCase = " + str.toLowerCase());
        System.out.println("first index of 'н' = " + str.indexOf('н'));
        System.out.println("first index of 'W' = " + str.indexOf('W'));
        System.out.println("words: " + Arrays.toString(str.split(" ")));
    }
}
