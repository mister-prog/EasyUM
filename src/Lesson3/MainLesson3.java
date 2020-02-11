package Lesson3;

public class MainLesson3 {
    public static void main(String[] args)
    {
        logicals();
    }

    public static void logicals ()
    {
        //проверяем логические операторы
        boolean istina = true;
        boolean newIstina = istina & (calc() > 3);
        System.out.println("Результат выполнения условия \"istina & (calc() > 3)\" равен " + newIstina);
    }

    static int calc()
    {
        System.out.println("Это вывод из метода calc() ");
        return 4;
    }

}
