package lesson12__2_4;

public abstract class AnimalCard {
    private final String name;
    private final String sound;
    private final AnimalCharacter[] characters;

    public AnimalCard(String name, String sound, AnimalCharacter[] characters) {
        this.name = name;
        this.sound = sound;
        this.characters = characters;
    }

    //@Override
    public void printInfo()
    {
        System.out.println("Название: " + name);
        System.out.println("Звук: " + sound);

        for (AnimalCharacter character : characters) {
            character.printSign();
            character.printInfo();
        }
    }
}
