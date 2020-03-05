package lesson10__2_2.animal;

public class Animal {
    private String name;

    protected Animal(String name)
    {
        this.name = name;
    }

    public String sound()
    {
        return "none";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
