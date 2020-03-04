package homeWork.hw9;

public class hw9RealObject {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudName("Evgeny Petrov");
        student.setCourse("Java for everybody");
        student.setGroup("EasyUm-01");

        Student subj = new Student("Тестирование", 5);

        print("----- Инфо по студенту -----");

        print("Студент: " + student.getStudName());
        print("Курс: " + student.getCourse());
        print("Группа: " + student.getGroup());

        print("---------------------");
        print("Предмет = оценка:");

        print(subj.toString());

        subj = new Student("Автоматизация", 5);
        print(subj.toString());

        subj = new Student("Программирование", 5);
        print(subj.toString());

    }

    static void print(String s)
    {
        System.out.println(s);
    }
}
