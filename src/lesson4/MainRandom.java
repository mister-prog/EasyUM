package lesson4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainRandom {
    public static void main(String[] args) {
        //варианты вызова Random от min до max

        //threadGenNum(1, 100);
        //mathGenNum(1, 100);
        genNumVariant();
    }


    public static void mathGenNum(int min, int max) {
        //Math.random()
        int genNum;
        for (int i = 0; i < 100; i++) {
            genNum = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("Рандомное число " + (i + 1) + " равно " + genNum);
        }
    }

    public static void threadGenNum(int min, int max) {
        //оптимальный ThreadLocalRandom.current().nextInt();
        int threadRand;
        for (int i = 0; i < 100; i++) {
            threadRand = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println("Рандомное число " + (i + 1) + " равно " + threadRand);
        }
    }

    public static void genNumVariant() {
        //new Random().nextInt(5); // [0...4] [min = 0, max = 4]
        int genNumVar;

        for (int i = 0; i < 500; i++) {
            genNumVar = (new Random().nextInt(100) + 1); //по идее, от [0...99] + 1
            System.out.println("Рандомное число " + (i + 1) + " равно " + genNumVar);
        }
    }
}