package lesson11__2_3;

public abstract class RunnableAnimal extends Animal implements IRunnableAnimal{
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    protected RunnableAnimal(String name, String sound, int speed) {
        super(name, sound);
        this.speed = speed;
    }

    @Override
    protected void addPrint() {
        System.out.println("Бегаю со скоростью " + speed + " км в час");
    }
}
