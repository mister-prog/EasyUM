package lesson3;

public class MainIf {
    public static void main(String[] args) {
        //преобразования типов
        //double >> float >> long >> int >> char

        //приведение без проблем - от меньших типов к большим
        int a = 9 * 7 - 12;
        long b = a * 3;
        double c = b;

        //huliganstvo(); //ругается матом )))
        toDouble();
    }


    public static void toDouble() {
       /* int i = 7, j = 8, k = 0;
        double result = (i + j)/k; //явное приведение

        System.out.println("Деление на нуль\nresult = " + result);
        получаем Exception*/

        int i = -176, j = 8, k = 2;
        if ((i > 0) && (j > 0) && (k != 0)) {
            double result = (i + j) / k;
            System.out.println("Деление на нуль\nresult = " + result);
        } else {
            System.out.println("Условия не соблюдены!");
        }
    }
}
