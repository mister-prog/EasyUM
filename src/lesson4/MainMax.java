package lesson4;

public class MainMax {
    public static void main(String[] args) {
        System.out.println("Result = " + max(-323, -5));
        System.out.println("Result = " + max(23, 23, 0));
    }

   /* static int max (int a, int b)
    {
        if (a < b) {
            System.out.println("Наибольшее число из A = " + aq
                    + " и B = " + b + " число  B");
            return b;
        } else if (a > b) {
            System.out.println("Наибольшее число из A = " + a
                    + " и B = " + b + " число  A");
            return a;
        } else
            System.out.println("Числа A = " + a
                    + " и B = " + b + " равны");
        return a;
    }*/

    static int max(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
        return a > b ? a : b; // тернарная операция
    }

    static int max(int a, int b, int c)
    {
        /*int m1 = max(a, b);
        int m2 = max(m1, c);
        return m2;*/

        return (max(max(a,b),c)); // сокращаем  запись
    }


}
