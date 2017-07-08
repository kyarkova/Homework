package lesson170707.homework;

/**
 * Created by admin4 on 08.07.2017.
 */
public class StringArraylistTest {
    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

        list.add("one");

        System.out.println(list);

        list.add("two");

        System.out.println(list);

        list.remove(0);
        list.remove(0);

        System.out.println(list);

        list.add("three");

        System.out.println(list);

        list.add("four");
        list.add("five");

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        list.remove("four");
        list.remove("five");
        list.remove("three");
        list.remove("five");

        System.out.println(list.isEmpty());


        System.out.println(list);
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(10));


        System.out.println(list.set(0, "num"));
        System.out.println(list.set(3, "num"));
        System.out.println(list.set(4, "num"));
        System.out.println(list.set(10, "num"));

        System.out.println(list);
    }
}
