package Lesson4;

public class MainFor2 {
    public static void main (String[] args)
    {
//       // кратно двум
//       for (int i = 10; i >= 1; i--)
//       {
//           if (i%2 == 0)
//           {
//               System.out.println(i);
//           }
//       }

        // кратно двум
       /* for (int i = 10; i >= 1; i = i-2)
        {
                System.out.println(i);
        }*/

        //хотим Х в степени n
        int x = 3;
        int n = 5;
        int result = 1;

        for (int i = 1; i <= n; i++)
        {
            result = result * x;
            System.out.println("r[" + i +"] = " + result);
        }

        System.out.println("Результат возведения " + x + " в степень " + n + " равен " + result);
    }
}
