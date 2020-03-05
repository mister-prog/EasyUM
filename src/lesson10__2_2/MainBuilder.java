package lesson10__2_2;

public class MainBuilder {
    public static void main(String[] args) {
       /* StringBuilder builder = new StringBuilder()
                .append(12)
                .append(true)
                .delete(2,1)
                .insert(8, '\u2596');*/

        System.out.println(new StringBuilder()
                .append(12)
                .append(true)
                .delete(1,1)
                .insert(3, '\u264F')
                .insert(7, "Жесть!")
                .toString()
        );
    }
}
