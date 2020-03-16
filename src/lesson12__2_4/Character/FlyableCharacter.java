package lesson12__2_4.Character;

public class FlyableCharacter implements AnimalCharacter {
    private final int distance;

    public FlyableCharacter(int distance) {
        this.distance = distance;
    }

    @Override
    public void printInfo() {
        System.out.println("Летаю на расстояние " + distance + " км");
    }

    @Override
    public void printSign() {
        System.out.println("/U\\");
    }
}
