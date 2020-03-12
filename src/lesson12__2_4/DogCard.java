package lesson12__2_4;

public class DogCard extends AnimalCard {
    public DogCard() {
        super(
                "Собака",
                "Гав-гав",
                new AnimalCharacter[]
                        {
                                new RunnableCharacter(18)
                        });
    }
}
