package lesson10__2_2;

import lesson10__2_2.animal.Animal;
import lesson10__2_2.animal.Dog;

public class MainAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal("any"); //конструктор - protected

        Animal dog = new Dog(); //потому что наследуем

        //soundOf(animal);
        soundOf(dog);
        dogSound((Dog)dog);// без (Dog) не работает, т.к. от частного к общему не получится, надо приводить типы
    }

    static void dogSound(Dog dog)
    {

    }

    static void soundOf(Animal animal)
    {
        System.out.println(String
                .format("Sound of %s is %s", animal
                        .getName(), animal
                        .sound()));
    }
}
