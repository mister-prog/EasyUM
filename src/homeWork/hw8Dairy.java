package homeWork;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import static usefuls.ConsoleInput.*;

public class hw8Dairy {
    public static void main(String[] args) {
        Dairy note = new Dairy();
        Dairy[] notes = new Dairy[3];

        littleDairy(notes, note);
    }

    static void littleDairy(Dairy[] notes, Dairy note) {
        menu(notes, note);
    }

    static void menu(Dairy[] notes, Dairy note) {
        do {
            printLn("Выберите действие:");
            printLn("1 - Добавить запись");
            printLn("2 - Показать записи");
            printLn("3 - Найти запись");
            printLn("4 - Удалить запись");
            printLn("0 - Выход");
            cursor();

            byte item = getNumInfo();
            switch (item) {
                case 1:
                    addNote(notes);
                    break;
                case 2:
                    showNotes(notes);
                    break;
                case 3:
                    //todo сделать поиск - по дате, названию, настроению, +/- бюджету и т.п.
                    findNote(notes);

                    break;
                case 4:
                    deleteNote(notes);
                    break;
                /*case 5:
                    //todo сделать findAndChange();
                    findAndChangeNote();
                    break;*/
                case 0:
                    return;
                default:
                    printLn("Некорректное значение!");
            }
            printLn("");
        }
        while (true);
    }

    private static void findNote(Dairy[] notes) {
        byte i = findNoteByNum(notes);
        if (i != -1) {
            showNote(notes[i]);
        }
    }

    private static void deleteNote(Dairy[] notes) {
        byte i = findNoteByNum(notes);
        if (i != -1) {
            notes[i] = null;
            printLn("Запись удалена"); //todo Почему удаляет все последующие записи?
            //showNotes(notes);
        }
    }

    private static byte findNoteByNum(Dairy[] notes) {
        printLn("Введите название записи для поиска: ");
        String noteName = getStringInfo();
        boolean isNote = false;

        for (byte i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                isNote = false;
            } else {
                if (notes[i].name.equalsIgnoreCase(noteName)) {
                    return i;
                }
            }
        }
        if (!(isNote)) {
            printLn("Такой записи не существует!");
        }
        return -1;
    }

    private static void showNotes(Dairy[] notes) {
        for (Dairy note : notes) {
            if (note == null) {
                continue;
            }
            printLn("-------------------------------");
            showNote(note);
        }
    }

    private static void showNote(Dairy note) {
        SimpleDateFormat myDate = new SimpleDateFormat("dd.MM.YYYY hh:mm");

        printLn("Дата: " + myDate.format(note.currentDate));
        printLn("Название: " + note.name);
        printLn("Настроение: " + note.emotion);
        printLn("Физическое состояние на " + note.physicalState + " из 5");
        printLn("Мысль дня: " + note.mainIdea);
        printLn("Описание: " + note.description);
        printLn("Потрачено: " + note.moneyMinus);
        printLn("Приобретено: " + note.moneyPlus);

        //todo вынести в отдельный метод
        note.balance = note.moneyPlus - note.moneyMinus;
        printLn("Баланс дня: " + note.balance);
    }

    private static Dairy createNote() {
        Dairy note = new Dairy();
        note.currentDate = new Date();

        printLn("Введите название записи: ");
        note.name = getStringInfo();

        printLn("Выберите настроение дня: ");
        note.emotion = chooseEmotion();

        printLn("Введите физическое состояние (1...5): ");
        note.physicalState = getState();

        printLn("Введите идею дня: ");
        note.mainIdea = getStringInfo();

        printLn("Введите описание: ");
        note.description = getStringInfo();

        printLn("Сколько вы сегодня потратили: ");
        note.moneyMinus = waitFloat();

        printLn("Сколько вы сегодня получили: ");
        note.moneyPlus = waitFloat();

        return note;
    }

    static byte getState() {
        byte state;
        do {
            cursor();
            state = (byte) (waitInt());
        }
        while (state < 1 || state > 5);

        return state;
    }

    private static char chooseEmotion() {
        do {
            printLn("1 - " + '\u263A');
            printLn("2 - " + '\u2639');
            cursor();

            byte item = getNumInfo();
            switch (item) {
                case 1:
                    return '\u263A';
                case 2:
                    return '\u2639';
                default:
                    printLn("Некорректное значение!");
            }
        }
        while (true);
    }

    static void addNote(Dairy[] notes) {
        for (byte i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = createNote();
                return;
            }
        }
        printLn("Дневник переполнен\nУдалите какую-либо запись для добавления новой");
    }


    static byte getNumInfo() {
        Scanner in = new Scanner(System.in);
        return (byte) (waitInt());
    }

    static String getStringInfo() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static void printLn(String str) {
        System.out.println(str);
    }

    private static void cursor() {
        System.out.print("> ");
    }
}
