package homeWork.hw10.speciality;


import java.util.concurrent.ThreadLocalRandom;

public class Tester extends Person {

    String[] specialities = {"Ручное тестирование", "Автоматизированное тестирование", "Нагрузочное тестирование", "Тестирование безопасности"};

    int i = ThreadLocalRandom.current().nextInt(0, specialities.length);

    public Tester(String name, String inn) {
        super(name, inn);
    }

    String profession = profession();

    @Override
    public String toString() {
        return "Tester{" +
                " name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                ", profession='" + profession + '\'' +
                ", speciality='" + specialities[i] +
                '}';
    }
}
