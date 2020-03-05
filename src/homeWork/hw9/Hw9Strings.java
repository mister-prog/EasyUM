package homeWork.hw9;

import static usefuls.ConsoleInput.waitString;

public class Hw9Strings {
    public static void main(String[] args) {
        print("Задача: ");
        print("1. Обрезать пробелы в начале и в конце строки");
        print("2. Вывести первую букву в строке UpperCase'ом");
        print("3. Вывести все остальные буквы строки LowerCase'ом");
        print("");
        print("Введите строку:");

        String str = waitString();

        //String str = "       сТроКА дЛя провЕрКи удАлЕНИя пРоБеЛов ПЕРед и пОСлЕ сТрОки, оТОбражЕниЯ в нИжНЕм рЕГистрЕ всЕй стРоКи, крОме пЕрвОЙ буКвЫ               ";

        print("");
        print("Итоговая строка:\n" + resultString(str));
    }

    private static void print(String string) {
        System.out.println(string);
    }

    private static String resultString(String text) {
        return text
                .trim()
                .substring(0, 1)
                .toUpperCase()
                .concat(text
                        .trim()
                        .substring(1)
                        .toLowerCase());
    }
}
