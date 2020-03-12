package lesson12__2_4.Object;

public class MainObject {
    public static void main(String[] args) {

        Person a = new Person("Иванов", 27);
        Person b = new Person("Иванов", 27);
        Person c = new Person("Иванов", 27);

        //equals() не работает
        //вводим доп. условия
        //! asserts на проде использовать нельзя !

       /* assert a.equals(a) == true; // рефлексия
        assert a.equals(b) == b.equals(a); // симметричность
        assert a.equals(c) && b.equals(c) && a.equals(b); //== true;//транзитивность
        assert a.equals(null) == false;//null
        //постоянство сравнения во времени, если объекты не менялись*/


        assertTrue(a.equals(a) == true, "Нарушена рефлексия"); // рефлексия
        assertTrue(a.equals(b) == b.equals(a), "Нарушена симметричность"); // симметричность
        assertTrue(a.equals(c) && b.equals(c) && a.equals(b) == true, "Нарушена транзитивность"); //== true;//транзитивность
        assertTrue(a.equals(null) == false, "Нулевой объект");//null
        //постоянство сравнения во времени, если объекты не менялись

        System.out.println("Равны ли? " + a.equals(b));
    }

    static void assertTrue(boolean condition, String description)
    {
        if (!condition)
        {
            throw new RuntimeException(description);
        }
    }
}
