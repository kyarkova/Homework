package lesson170710.homework;


public class UseStringLinkedList {

    public static void main(String[] args) {

        StringLinkedList list = new StringLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);

        System.out.println(list.remove("two"));

        System.out.println(list);

        list = new StringLinkedList();

        System.out.println(list.remove("two"));

        list.add("One");
        System.out.println(list.remove("two"));
        System.out.println(list.remove("One"));

        System.out.println(list);

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        //System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.remove(10));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));


        System.out.println(list);


    }

}
