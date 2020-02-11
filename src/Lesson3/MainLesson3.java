package Lesson3;

public class MainLesson3 {
    public static void main(String[] args) {
        logicalsAND();
        logicalsOR();
    }

    public static void logicalsAND() {
        //AND
        // 1 1 -> 1
        // 1 0 -> 0
        // 0 1 -> 0
        // 0 0 -> 0
        //проверяем логические операторы - ПОЛНЫЙ вариант (проверяются ОБА условия)
        boolean istinaANDComplete = true;
        boolean newIstinaANDComplete = istinaANDComplete & (calc() > 3);
        System.out.println("Результат выполнения условия \"istinaANDComplete & (calc() > 3)\" равен " + newIstinaANDComplete);

        //проверяем логические операторы - СОКРАЩЕННЫЙ вариант (проверяется ПЕРВОЕ условие)
        boolean istinaAND = false;
        boolean newIstinaAND = istinaAND && (calc() > 3);
        System.out.println("Результат выполнения условия \"istinaAND && (calc() > 3)\" равен " + newIstinaAND);
    }

    public static void logicalsOR() {
        //OR
        // 1 1 -> 1
        // 1 0 -> 1
        // 0 1 -> 1
        // 0 0 -> 0
        //проверяем логические операторы - ПОЛНЫЙ вариант (проверяются ОБА условия)
        boolean istinaORComplete = true;
        boolean newIstinaORComplete = istinaORComplete | (calc() > 3);
        System.out.println("Результат выполнения условия \"istinaORComplete & (calc() > 3)\" равен " + newIstinaORComplete);

        //проверяем логические операторы - СОКРАЩЕННЫЙ вариант (проверяется ПЕРВОЕ условие)
        boolean istinaOR = false;
        boolean newIstinaOR = istinaOR || (calc() < 3);
        System.out.println("Результат выполнения условия \"istinaOR || (calc() < 3)\" равен " + newIstinaOR);
    }

    static int calc() {
        System.out.println("Это вывод из метода calc() ");
        return 4;
    }

}
