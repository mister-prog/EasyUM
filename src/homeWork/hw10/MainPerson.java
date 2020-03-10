package homeWork.hw10;

import homeWork.hw10.speciality.Programmer;
import homeWork.hw10.speciality.Tester;


public class MainPerson {
    public static void main(String[] args) {

        Tester test = new Tester("Петров Сергей", "Без ИНН");
        System.out.println(test.toString());

        Programmer prog = new Programmer("Смирнов Андрей", "FU05646546568");
        System.out.println(prog.toString());

    }
}
