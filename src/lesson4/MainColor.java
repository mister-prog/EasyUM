package lesson4;

public class MainColor {
    public static void main(String[] args)
    {
        for (int colorCode = 0; colorCode <= 5; colorCode++)
        {
            System.out.println("code = " + colorCode + " text = "  + getColorText(colorCode));
        }
    }

    static String getColorText(int colorCode)
    {
        switch (colorCode) { //Здесь break не нужен,т.к. прерывается по return
            case 1:
                return "Зеленый";
            case 2:
                return "Фиолетовый";
            case 3:
                return "Красный";
            default:
                return "прозрачный";
        }
    }
}
