package lesson170809.homework;

public class UseDictionary {

    public static void main(String[] args) {

//        Dictionary<String, String> d = new Dictionary();
//
//        d.put("Pete", "New York");
//        d.put("John", "Boston");
//
//        d.remove("Маша");
//
//        d.put("Маша", "Москва");
//
//        d.remove("Маша");
//
//        d.put("Вася", "Москва");
//        d.put("Петя", "Москва");
//        d.put("Боря", "Москва");
//        d.put("Оля", "Москва");
//        d.put("Жанна", "Москва");
//        d.put("Вано", "Москва");
//        d.put("George", "New York");
//        d.put("Jim", "New York");
//        d.put("Kevin", "New York");
//        d.put("Clark", "New York");
//
//        System.out.println(d.get("Ann"));
//        System.out.println(d.get("John"));
//        System.out.println(d.get("Вася"));
//
//        d.put("Вася", "Петербург");
//        System.out.println(d.get("Вася"));
//
//        for (Pair pair : d) {
//            System.out.println(pair.key + " : " + pair.value);
//        }

        Dictionary<String, String> d = new Dictionary();
        long start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            d.put("" + i, "" + i);
        }
        System.out.println("1_000 elements put      : " + (System.nanoTime() - start));
        for (int i = 0; i < 1_000; i++) {
            d.get("" + i);
        }
        System.out.println("1_000 elements get      : " + (System.nanoTime() - start));
        for (int i = 0; i < 1_000; i++) {
            d.remove("" + i);
        }
        System.out.println("1_000 elements remove   : " + (System.nanoTime() - start));
        System.out.println("1_000 elements total    : " + (System.nanoTime() - start));
        System.out.println();

        for (int i = 0; i < 10_000; i++) {
            d.put("" + i, "" + i);
        }
        System.out.println("10_000 elements put     : " + (System.nanoTime() - start));
        for (int i = 0; i < 10_000; i++) {
            d.get("" + i);
        }
        System.out.println("10_000 elements get     : " + (System.nanoTime() - start));
        for (int i = 0; i < 10_000; i++) {
            d.remove("" + i);
        }
        System.out.println("10_000 elements remove  : " + (System.nanoTime() - start));
        System.out.println("10_000 elements total   : " + (System.nanoTime() - start));
        System.out.println();

        for (int i = 0; i < 100_000; i++) {
            d.put("" + i, "" + i);
        }
        System.out.println("100_000 elements put    : " + (System.nanoTime() - start));
        for (int i = 0; i < 100_000; i++) {
            d.get("" + i);
        }
        System.out.println("100_000 elements get    : " + (System.nanoTime() - start));
        for (int i = 0; i < 100_000; i++) {
            d.remove("" + i);
        }
        System.out.println("100_000 elements remove : " + (System.nanoTime() - start));
        System.out.println("100_000 elements total  : " + (System.nanoTime() - start));


    }

}
