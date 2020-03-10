package homeWork.hw10.speciality;

import static usefuls.ConsoleInput.waitString;

public class Person {

    String name;
    String inn;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }
    public void setInn(String inn) {
        this.inn = inn;
    }

    public Person() {
    }

    public Person(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String profession() {
        System.out.println("\nВведите профессию: ");
        return waitString();
    }

}
