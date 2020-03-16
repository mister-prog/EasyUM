package lesson12__2_4.Character;

public class RunnableCharacter implements AnimalCharacter {
    private final int speed;

    public RunnableCharacter(int speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Бегаю со скоростью " + speed + " км/ч");
    }

    @Override
    public void printSign() {
        System.out.println("LL-LL");
    }
}
