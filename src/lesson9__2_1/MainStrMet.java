package lesson9__2_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

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

        System.out.println("trim: " + "|" + "  Fedor   ".trim() + "|");
        System.out.println("Пустая? " + "".isEmpty());
        System.out.println("Пробелы? " + "            ".isBlank());

        System.out.println("Конкатенация: " + "1".concat("2"));


        String a1 = "Это Проверка Схожести Строк";
        String a2 = "Это проверка схожести строк";

        System.out.println("Одинаковый текст? " + a1.equalsIgnoreCase(a2));


        //----------------------------------
        String a = "good";
        String b = null;

        if (a.equals(b)) {
            //good
        }
     /*   if (b.equals(a)) {
            //bad
        }*/

        System.out.println("bad situation = " + Objects.equals(b, a)); //проверка не боится null
    }


    static boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }


}
