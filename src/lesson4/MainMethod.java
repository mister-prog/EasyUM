package lesson4;

public class MainMethod {
    public static void main (String[] args)
    {
        int result =  power(2,3); //  без static

        int result1 =  power(4,2); //  без static

        result = result * result1;
        System.out.println("result * result1 = " + result);

    }

   static int power(int x, int n)
    {
        int result = 1;
        for(int i = 1; i <= n; i++)
        {
            result = result * n;
            System.out.println("r[" + i +"] = " + result);
        }

        System.out.println("Результат возведения " + x + " в степень " + n + " равен " + result);
        return  result;
    }
}
