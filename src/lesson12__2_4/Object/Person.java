package lesson12__2_4.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this/*сам объект*/ == object) {
            return true;
        }
        if (object.getClass()/*пришедший класс*/ != getClass()/*наш класс*/) {
            return false;
        }

        Person person = (Person) object; //явное приведение
        return Objects.equals(name, person.name)/*String - ссылочный тип, поэтому используем метод из библиотеки*/
                && age == person.age /* int - простой тип*/;

    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
