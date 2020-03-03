package lesson9__2_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Vasya");

        System.out.println(person.toString());

        System.out.println(person.getAbName());

        //полиморфизм
        print(person);
        print(new Object());
        print(new float[0]);
        print(new String("Hello!"));
        print("Hello!\n");

        person = null;
        System.out.println(person);
        //System.out.println(person.getName());//обнулили person, но пытаемся вывести name => nullPointerException
    }

    static void print(Object obj)
    {
        System.out.println("obj = " + obj.toString());
    }
}
