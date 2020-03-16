package lesson12__2_4;


import lesson12__2_4.Card.AnimalCard;
import lesson12__2_4.Card.DogCard;
import lesson12__2_4.Card.GoldFishCard;
import lesson12__2_4.Card.HawkCard;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalCard[] cards = {new DogCard(), new HawkCard(), new GoldFishCard()};
        for (AnimalCard card : cards) {
            card.printInfo();
            System.out.println("---------------------------------------");
        }
    }

    //todo сделать описательную характеристику отдельным классом "семки есть/крестиком вышиваю/..."
}
