package lesson11__2_3;

public class Dog extends RunnableAnimal{
    public Dog() {
        super("Собака", "Гав-гав!", 50);
    }

    @Override
    protected void addPrint() {
        super.addPrint();
        System.out.println("Имя: Шарик\nМогу охранять и дружить");
    }
}
