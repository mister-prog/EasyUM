package lesson9__2_1;

public class MainStrMet {
    public static void main(String[] args) {
        String str = "Какой-то длинный неинтересный текст...";
        System.out.println("length = " + str.length());
        System.out.println("str[11] = " + str.charAt(11));

        System.out.println("UpperCase = " + str.toUpperCase());
    }
}
