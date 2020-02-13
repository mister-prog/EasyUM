package Lesson4;

public class MainFactorial {
    public static void main(String[] args)
    {
        int i = 1;
         while (i <=5)
         {
             System.out.println("fact(" + i + ") = " + fact(i)); // тут аккуратно с типами переменных! Неявное приведение типов!
             i++;
         }
    }

    // факториал n - натуральное, результат произведения от 1 до n
    static long fact(long n)
    {
        long result = 1;

        for (int i = 1; i <= n; i++)
        {
            result = result * i;
            System.out.println("r[" + i + "] = " + result);
        }
        return result;
    }
}
