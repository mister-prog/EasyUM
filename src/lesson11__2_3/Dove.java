package lesson11__2_3;

public class Dove extends Animal implements IFlyableAnimal, IRunnableAnimal {

    public Dove()
    {
        super("Голубь", "курлык-курлык");
    }

    @Override
    public int getDistance() {
        return 115;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    protected void addPrint()
    {
        System.out.println("Семки есть? А если найду?");
        System.out.println("Дальность полёта " + getDistance() + " км");
        System.out.println("Бегаю со скоростью  " + getSpeed() + " км/ч");
    }
}
