package lesson9__2_1;

public class MainString {
    public static void main(String[] args) {
        String str = new String("test"); //String - это массив char'ов. Неизменяемый класс!
        String str2 = "test";
        String str3 = "test";//одинаковые ссылки на один объект, если создано одинаково (строки str2 и str3)

        System.out.println("str == str2 " + str.equals(str2));
        System.out.println("str2 == str3" + (str2 == str3));

    }
}
