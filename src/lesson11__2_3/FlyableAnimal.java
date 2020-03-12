package lesson11__2_3;

public abstract class FlyableAnimal extends Animal implements IFlyableAnimal{

    private int distance;

    protected FlyableAnimal(String name, String sound, int distance) {
        super(name, sound);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    protected void addPrint() {
        System.out.println("Летаю за " + getDistance() + " километров");
    }
}
