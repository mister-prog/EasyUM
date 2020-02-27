package lesson8;

//Нормализация (напр., приведение к верхнему регистру) -> Валидация

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;

import static usefuls.ConsoleInput.waitInt;

public class MainTour {
    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.code = "3c5j4o5h345n34";
        tour.tourName = "Dream";
        tour.description = "Beautiful nature!";
        tour.startDate = new Date();
        tour.tripDuration = 14;
        tour.country = "Spain";
        tour.price = 30;

        Tour[] tours = new Tour[10]; //несколько туров
        tours[0] = tour;
        //System.out.println("Наши туры:\n" + Arrays.toString(tours));

        menu(tours);

        //showTour(tour);
        //showTours(tours);
    }

    private static void menu(Tour[] tours) {
        do {
            miMenu("Программа тура");
            miMenu("1 - Просмотреть туры (5 первых)");
            miMenu("2 - Создать тур");
            miMenu("3 - Удалить тур");
            miMenu("4 - Найти тур");
            miMenu("0 - Выйти из программы");
            cursor();

            int item = waitInt();
            switch (item) {
                case 1:
                    showTours(tours);
                    break;
                case 2:
                    Tour newTour = createTour();
                    addToTours(tours, newTour);
                    break;
                case 3:
                    deleteTour(tours);
                    break;
                case 4:
                    findTour(tours);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Команда не поддерживается");
            }
        }
        while (true);
    }

    private static void deleteTour(Tour[] tours) {
        System.out.println("Какой тур удалить? Введите код: ");
        Scanner in = new Scanner(System.in);
        String code = in.nextLine();

        for (int i = 0; i < tours.length; i++) {
            //todo проверка, если я ввожу код, которого нет
            if (code.equals(tours[i].code)) {
                tours[i] = null;
                return;
            }
        }
        System.out.println("Вы ввели слишком много туров!\nУдалите что-либо для вставки");


        }

    private static void findTour(Tour[] tours) {
        System.out.println("Куда вы хотите поехать? Введите страну: ");
        Scanner in = new Scanner(System.in);
        String laPais = in.nextLine();
        for (Tour tour : tours
        ) {
            if (tour == null) {
                return;
            }
            if (laPais.equalsIgnoreCase(tour.country)) {
                line();
                showTour(tour);
                line();
            }

        }
    }

    private static void line() {
        System.out.println("-------------------------------------");
    }

    private static void addToTours(Tour[] tours, Tour newTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = newTour;
                return;
            }
        }
        System.out.println("Вы ввели слишком много туров!\nУдалите что-либо для вставки");
    }

    private static Tour createTour() {
        Scanner in = new Scanner(System.in);
        Tour tour = new Tour();

        System.out.println("Введите код: ");
        tour.code = in.nextLine();
        System.out.println("Введите страну: ");
        tour.country = in.nextLine();
        System.out.println("Введите название: ");
        tour.tourName = in.nextLine();

        tour.startDate = new Date();

        return tour;
    }

  /*  static void input(Tour tour)
    {

    }*/

    private static void cursor() {
        System.out.print(">");
    }

    static void miMenu(String item) {
        System.out.println(item);
        System.out.println();
    }

    private static void showTours(Tour[] tours) {
        SimpleDateFormat myDate = new SimpleDateFormat("dd.MM.YYYY");

        for (Tour tour : tours) {
            if (tour == null) {
                break;
            }
            System.out.println("------------------------------------");
            showTour(tour);
        }
    }

    private static void showTour(Tour tour) {
        SimpleDateFormat myDate = new SimpleDateFormat("dd.MM.YYYY");

        System.out.println("Код: " + tour.code
                + "\nДата: " + myDate.format(tour.startDate)
                + "\nСтрана: " + tour.country
                + "\nНазвание тура: " + tour.tourName
                + "\nОписание тура: " + tour.description
                + "\nЧисло дней: " + tour.tripDuration
                + "\nСтоимость: " + tour.price);

    }


}
