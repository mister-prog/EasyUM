package lesson11__2_3;

public class Fish extends SweemableAnimal {
    public Fish() {
        super("Рыбка", "Буль-буль!", 135);
    }

    @Override
    protected void addPrint() {
        super.addPrint();
        System.out.println("Имя: Золотая рыбка\nМогу исполнять желания");
    }

}
