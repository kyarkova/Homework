package lesson170704.classwork;

import java.util.ArrayList;

/**
 * Created by kseni on 05.07.2017.
 */

public class ArrayListExamples {

    static ArrayList<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) {

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");

        System.out.println(listOfStrings);

        listOfStrings.remove(1);

        System.out.println(listOfStrings);
    }

}
