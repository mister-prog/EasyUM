package lesson8;

public class MainClassCitizen {
    public static void main(String[] args) {
        Citizen perviy = new Citizen();
        perviy.name = "Vasya";
        perviy.age = 102;
        perviy.inn = "2357862571895";

        System.out.println("perviy = " + perviy);// выводит имя класса с хешем lesson8.Citizen@b4c966a
        System.out.println("perviy = " + perviy.toString());
        System.out.println("perviy.name = " + perviy.name);
        System.out.println("perviy.age = " + perviy.age);




    }
}
