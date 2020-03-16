package lesson12__2_4.Card;

import lesson12__2_4.Character.AnimalCharacter;
import lesson12__2_4.Character.FlyableCharacter;
import lesson12__2_4.Character.RunnableCharacter;

public class HawkCard extends AnimalCard{
    public HawkCard() {
        super(
                "Ястреб",
                "А-а-а-а-а-а-а-а!",
                "я - гордый птиЦ",
                new AnimalCharacter[]
                        {
                                new RunnableCharacter(50),
                                new FlyableCharacter(100)
                        });
    }
}
