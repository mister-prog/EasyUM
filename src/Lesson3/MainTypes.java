package Lesson3;

public class MainTypes {
    public static void main(String[] args)
    {
        //преобразования типов
        //double >> float >> long >> int >> char

        //приведение без проблем - от меньших типов к большим
        /*int a = 9 * 7 - 12;
        long b = a * 3;
        double c = b;*/

        huliganstvo(); //ругается матом )))
        toDouble();
    }

    public static void huliganstvo ()
    {
        char h = 1061;
        char y = 1091;
        char z = 1081;
        char n = 'Ё';
        char m = 'м';
        char p = 'о';
        char t = 'ё';
        System.out.printf("Хулиганская программка =)\nВыводит нехорошее слово: %c%c%c\n", h ,y ,z );
        System.out.println(n + m + p + t);
    }
    public static void toDouble ()
    {
        int i = 7, j = 8, k = 2;
        double result1 = (double) (i + j)/k; //явное приведение

        double l = 5.3;
        int m = 2, n = 54;
        double result2 = (l + m)/n; //НЕявное приведение
        System.out.println("Явное приведение\nresult1 = " + result1 + "\nНевное приведение\nresult2 = " + result2);
    }
}
