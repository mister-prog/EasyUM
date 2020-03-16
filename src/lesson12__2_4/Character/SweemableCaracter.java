package lesson12__2_4.Character;

public class SweemableCaracter implements AnimalCharacter {
    private final int speed;

    public SweemableCaracter(int speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Плаваю со скоростью " + speed + " км/ч");
    }

    @Override
    public void printSign() {
        System.out.println(">=0>");
    }
}
