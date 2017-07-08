package utils;

/**
 * Created by kseni on 24.06.2017.
 */
public class SimpleUnit {
    public static boolean assertEquals(String actual, String expected) {
        boolean equals = actual.equals(expected);
        if (!equals) printError(actual, expected);
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        boolean notEquals = !actual.equals(expected);
        if (!notEquals) printErrorNot(actual, expected);
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean equals = actual == expected;
        if (!equals) printError("" + actual, "" + expected);
        return equals;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean notEquals = actual != expected;
        if (!notEquals) printErrorNot("" + actual, "" + expected);
        return notEquals;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean equals = actual == expected;
        if (!equals) printError("" + actual, "" + expected);
        return equals;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean notEquals = actual != expected;
        if (!notEquals) printErrorNot("" + actual, "" + expected);
        return notEquals;
    }

    private static void printError(String actual, String expected) {
        System.err.println("Test failed: expected: '" + expected + "', actual: '" + actual + "'");
    }

    private static void printErrorNot(String actual, String expected) {
        System.err.println("Test failed: expected NOT: '" + expected + "', actual: '" + actual + "'");
    }
}
