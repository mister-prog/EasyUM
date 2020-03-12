package lesson12__2_4;

public class HawkCard extends AnimalCard{
    public HawkCard() {
        super(
                "Ястреб",
                "А-а-а-а-а-а-а-а!",
                new AnimalCharacter[]
                        {
                                new RunnableCharacter(50),
                                new FlyableCharacter(100)
                        });
    }
}
