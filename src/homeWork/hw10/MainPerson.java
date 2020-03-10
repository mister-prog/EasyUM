package homeWork.hw10;

import homeWork.hw10.speciality.Person;
import homeWork.hw10.speciality.Programmer;
import homeWork.hw10.speciality.Tester;


public class MainPerson {
    public static void main(String[] args) {
        //Person chel = new Person();
        Tester test = new Tester("Петров Иван", "Без ИНН");
        System.out.println(test.toString());

        Programmer prog = new Programmer("Смирнов Андрей", "FU05646546568");
        System.out.println(prog.toString());


        /*switch (prof)
        {
            case "Тестер":
            {
                Tester tester = new Tester("Alfredo Velasquez","DS354353", prof);
                tester.toString();
            }
            case "Прогер":
            {
                Programmer programmer = new Programmer("Pasio Casillas","FG3285765", prof);
                programmer.toString();
            }
            default:
                System.out.println("Для данной профессии специализации не определены");
        }*/
    }

   /* private static void showSpecialization(Person chel) {
        if (chel.profession == "Программист" || chel.profession == "Programmer")
        {
            return chel.randSpec(Programmer);//обращаемся к классу Programmer;
        }
        else if (chel.profession == "Тестировщик" || chel.profession == "Tester")
        {
            return chel.randSpec(Tester);//обращаемся к классу Tester;
        }
        else
        {
            System.out.println("Для данной профессии специализации не определены");
        }
    }

    public String profession() {
        System.out.println("\nВведите профессию: ");
        return waitString();
    }

    public String randSpec(String[] specialization)
    {
        int i = ThreadLocalRandom.current().nextInt(0,specialization.length);
        return specialization[i];
    }*/
}
