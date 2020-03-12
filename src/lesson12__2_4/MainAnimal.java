package lesson12__2_4;


public class MainAnimal {
    public static void main(String[] args) {
        AnimalCard[] cards = {new DogCard(), new HawkCard()};
        for (AnimalCard card : cards) {
            card.printInfo();
            System.out.println("---------------------------------------");
        }
    }

    //todo сделать описательную характеристику отдельным классом "семки есть/крестиком вышиваю/..."
}
