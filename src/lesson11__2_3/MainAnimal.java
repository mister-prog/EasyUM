package lesson11__2_3;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Raven(), new Fish()};

        for (Animal el : animals) {
            el.printInfo();
            if (el instanceof IRunnableAnimal) {
                IRunnableAnimal runnable = (IRunnableAnimal) el;
                System.out.println("Бегает со скоростью " + runnable.getSpeed() + " километров в час ");
                System.out.println("LL-LL");
            }
            if (el instanceof FlyableAnimal) {

                System.out.println("/U\\");
            }
            else if (el instanceof SweemableAnimal) {

                System.out.println(">=O>");
            }
            System.out.println("-------------------------------------------");
        }

    }
}

// TODO: 10.03.2020 Чем отличаются абстрактный класс и интерфейс? 

