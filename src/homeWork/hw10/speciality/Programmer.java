package homeWork.hw10.speciality;

import java.util.concurrent.ThreadLocalRandom;

public class Programmer extends Person {
    String[] specialities = {"C++", "Java", "C#", "Python", "Go"};
    int i = ThreadLocalRandom.current().nextInt(0, specialities.length);

    public Programmer(String name, String inn) {
        super(name, inn);
    }

    String profession = profession();

    @Override
    public String toString() {
        return "Proger{" +
                " name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                ", profession='" + profession + '\'' +
                ", speciality='" + specialities[i] +
                '}';
    }
}


