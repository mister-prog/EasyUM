package lesson10__2_2;

public class MainString {
    public static void main(String[] args) {

        String who = "Tuzik";
        String template = "Привет, %s";
        String r = String.format(template, who);

        String[] names = {"World", "Мир", "Peace", "Медвед"};

        for (String name: names) {
            String res = String.format(template, name);
            System.out.println(res);
        }
        System.out.println(r);

        String matrixElement = String.format("matrix[%s, %s] = %s", 1, 2, 3);
        //"matrix[" + i + ", " + j + "] = " + matrix[i, j]
        System.out.println(matrixElement);
    }
}
