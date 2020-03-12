package lesson12__2_4;

public class RunnableCharacter implements AnimalCharacter {
    private final int speed;

    public RunnableCharacter(int speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("А я могу бегать со скоростью " + speed + " км/ч");
    }

    @Override
    public void printSign() {
        System.out.println("LL-LL");
    }
}
