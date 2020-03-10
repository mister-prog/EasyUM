package lesson11__2_3;

public class Raven extends FlyableAnimal implements IRunnableAnimal{
    public Raven() {
        super("Ворон", "Карррр!", 500);
    }

    @Override
    protected void addPrint() {
        super.addPrint();
        System.out.println("Имя: Хуг\nМудрая птица");
    }

    @Override
    public int getSpeed() {
        return 10;
    }
}
