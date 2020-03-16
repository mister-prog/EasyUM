package lesson12__2_4.Card;

import lesson12__2_4.Character.AnimalCharacter;

public abstract class AnimalCard {
    private final String name;
    private final String sound;
    private final String charact;
    private final AnimalCharacter[] characters;


    public AnimalCard(String name, String sound, String charact, AnimalCharacter[] characters) {
        this.name = name;
        this.sound = sound;
        this.charact = charact;
        this.characters = characters;
    }

    //@Override
    public void printInfo()
    {
        System.out.println("Название: " + name);
        System.out.println("Звук: " + sound);
        System.out.println("Характериктика: " + charact);

        for (AnimalCharacter character : characters) {
            character.printSign();
            character.printInfo();
        }
    }
}
