package lesson170624.classwork;

/**
 * Created by kseni on 24.06.2017.
 */
public class MinTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(10, 20), 10));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(10, 30), 10));

        System.out.println(SimpleUnit.assertEquals(MathUtils.min(20, 10), 10));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(30, 10), 10));

        System.out.println(SimpleUnit.assertEquals(MathUtils.min(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(0, Integer.MAX_VALUE), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(0, Integer.MIN_VALUE), Integer.MIN_VALUE));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(30, 10), 30));

    }
}