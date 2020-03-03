package lesson9__2_1;

public class Person {
    private String name;

    void setName(String name) //сеттер
    {
        if(name == null || name.isEmpty())
        {
            return; //если прислали фигню, ничего не вносим
        }
        this.name = name;
    }

    String getName() //геттер
    {
        return name;
    }

    String getAbName()
    {
        return name.substring(1, 4); //несколько символов
    }

    //Alt + Insert - переопределение метода toString
    @Override//аннотация (можно убирать)
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
