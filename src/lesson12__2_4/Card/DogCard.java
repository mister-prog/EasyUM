package lesson12__2_4.Card;

import lesson12__2_4.Character.AnimalCharacter;
import lesson12__2_4.Character.RunnableCharacter;
import lesson12__2_4.Character.SweemableCaracter;

public class DogCard extends AnimalCard {
    public DogCard() {
        super(
                "Собака",
                "Гав-гав",
                "Я - твой лучший друг!",
                    new AnimalCharacter[]
                        {
                                new RunnableCharacter(18),
                                new SweemableCaracter(20)
                        });
    }
}
