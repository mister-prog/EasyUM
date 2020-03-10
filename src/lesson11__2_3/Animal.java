package lesson11__2_3;

public abstract class Animal {
    private String name;
    private String sound;

    protected Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
    public final void printInfo() {
        System.out.println("Название: " + getName());
        System.out.println("Звук: " + getSound());
        addPrint();
    }

    protected abstract void addPrint();
}
