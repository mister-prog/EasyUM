package lesson10__2_2;

public class PersonBuilder {
    private Person product;

    public PersonBuilder()//конструктор для билдера
    {
        product = new Person();
    }

    public PersonBuilder setName(String name)
    {
        if(name == null)
        {
            System.out.println("Not null name!");
            return this;
        }
        product.setName(name);
        return this;
    }

    public PersonBuilder setAge(int age)
    {
        if(age > 0)
        {
            System.out.println("Wrong age!");
            return this;
        }
        product.setAge(age);
        return this;
    }

    public Person build()
    {
        return product;
    }
}
