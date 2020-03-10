package lesson10__2_2.animal;

public class Dog extends Animal {
    /*public Dog(String name) {
        super(name);
    }*/

    public Dog() {
        super("Dog");
    }

    @Override
    public String sound() {
        return "Гав-гав";
    }
}
