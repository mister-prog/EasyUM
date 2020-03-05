package lesson10__2_2;

import static lesson10__2_2.MyMath.sum;

public class MainStatic {
    public static void main(String[] args) {
        //MyMath myMath = new MyMath();
        //если методы статические, не надо создавать инстанцию!
        //чтобы обезопасить, создаем private-конструктор

        int r1 = sum(3, 9);
        int r2 = sum(6,2);

    }
}
