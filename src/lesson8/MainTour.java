package lesson8;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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
        tours[1] = tour;
        //System.out.println("Наши туры:\n" + Arrays.toString(tours));

        //showTour(tour);
        showTours(tours);
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

        System.out.println("Дата: " + myDate.format(tour.startDate)
                + "\nСтрана: " + tour.country
                + "\nНазвание тура: " + tour.tourName
                + "\nОписание тура: " + tour.description
                + "\nЧисло дней: " + tour.tripDuration
                + "\nСтоимость: " + tour.price);

    }
}
