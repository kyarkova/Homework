package lesson170823.homework;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String text = "There are three possibilities for when this code is run. If seeAnimal() doesn’t throw an\n" +
                "exception, nothing is printed out. If the animal is out for a walk, only the frst catch block\n" +
                "runs. If the exhibit is closed, only the second catch block runs.\n" +
                "A rule exists for the order of the catch blocks. Java looks at them in the order they\n" +
                "appear. If it is impossible for one of the catch blocks to be executed, a compiler error\n" +
                "about unreachable code occurs. This happens when a superclass is caught before a subclass.\n" +
                "Remember, we warned you to pay attention to any subclass exceptions.\n" +
                "In the porcupine example, the order of the catch blocks could be reversed because the\n" +
                "exceptions don’t inherit from each other. And yes, we have seen a porcupine be taken for a\n" +
                "walk on a leash.";

        countWords(text);
    }

    private static void countWords(String text) {

        String[] words = text.split("\\p{P}|\\s");
        Map<String, Integer> map = new HashMap<>();

        for (String str : words) {
            str = str.toLowerCase();
            if (!"".equals(str)) {
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
        System.out.println(map);
    }
}
