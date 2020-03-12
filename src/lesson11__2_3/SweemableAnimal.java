package lesson11__2_3;

public abstract class SweemableAnimal extends Animal {
    private int distance;

    /*@Override
    public int getSpeed() {
        return distance;
    }*/

    protected SweemableAnimal(String name, String sound, int distance) {
        super(name, sound);
        this.distance = distance;
    }

    @Override
    protected void addPrint() {
        System.out.println("Плаваю на расстояние " + distance + " км");
    }
}






