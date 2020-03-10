package lesson11__2_3;

public class Cat extends RunnableAnimal {

    @Override
    protected void addPrint() {
        super.addPrint();
        System.out.println("Имя: Матроскин\nА я ещё крестиком вышивать умею");
    }

    public Cat() {
        super("Кошка", "Мяу!", 20);
    }
}
