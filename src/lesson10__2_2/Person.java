package lesson10__2_2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String inn;

    //фабричный метод - если нужно только часть параметров
    //метод, который производит объект
    public static Person child(String name, int age)
    {
        Person person = new Person();
        person.name = name;
        person.age = age;
        person.inn = "<undefined>";
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInn() {
        return inn;
    }


    public void setInn(String inn) {
        this.inn = inn;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", inn='" + inn + '\'' +
                '}';
    }



    public Person (String name, int age, String inn)
    {
        this.name = name;
        this.age = age;
        this.inn = inn;
    }

    public Person() //ссылается на предыдущий
    {
        this("Fedya", 23, "BH8632895723895");
    }

    public Person(Person origin)//ссылается на первый конструктор - копирующий конструктор
    {
        this(origin.name, origin.age, origin.inn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(inn, person.inn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, inn);
    }
}
