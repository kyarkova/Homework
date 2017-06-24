package ClassWork;

/**
 * Created by kseni on 24.06.2017.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(assertEquals("Hello", "Hello"));
    }

    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }

    private static String fizzBuzz(int i) {
        if (i % 3 == 0) return "Fizz";
        else if (i % 5 == 0) return "Buzz";
        else return "";
    }
}
