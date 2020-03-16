package lesson12__2_4.Card;

import lesson12__2_4.Character.AnimalCharacter;
import lesson12__2_4.Character.SweemableCaracter;

public class GoldFishCard extends AnimalCard {
    public GoldFishCard() {
        super(
                "Золотая рыбка",
                "Буль-буль-буль!",
                "Исполняю заветные желания",
                new AnimalCharacter[]
                        {
                                new SweemableCaracter(30)
                        });
    }
}
