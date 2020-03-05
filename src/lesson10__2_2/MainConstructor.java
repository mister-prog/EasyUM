package lesson10__2_2;

import javax.sound.midi.Soundbank;

import static lesson10__2_2.Person.child;

public class MainConstructor {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person = " + person);

        Person pPerson = new Person("Vasya", 20, "JG1246827461");
        System.out.println("pPerson = " + pPerson);

        Person copyPerson = new Person(pPerson);
        System.out.println("copyPerson = " + copyPerson);
        System.out.println("== " + (pPerson == copyPerson));
        System.out.println("equals " + pPerson.equals(copyPerson)); //не работает для объектов, если equals не переопределён
        System.out.println("factory " + child("Толик", 3));

        System.out.println("factory " + child("Лёлик", 5));

        //(new Person()).child(); - так делать нельзя!

        System.out.println("class = " + copyPerson.getClass());
        //метаданные - это данные о данных

        System.out.println("builder = " + new PersonBuilder()
                .setName("Kto-to")
                .setAge(15)
                .build()
        );




    }
}
// если наследуем конструктор, вызываем его через super()